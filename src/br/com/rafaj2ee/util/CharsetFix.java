package br.com.rafaj2ee.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PushbackInputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.List;

public class CharsetFix {
	static final String noPrecision[] = {"\\341","\\351","\\355","\\363","\\372","\\301",
			"\\311","\\315","\\323","\\332","\\347","\\307",
			"\\343","\\365","\\303","\\325","\\342","\\352",
			"\\356","\\364","\\373","\\302","\\312","\\316","\\324","\\333"};
	static final String precisonStrings[] = {"á","é","í","ó","ú","Á","É","Í","Ó","Ú","ç","Ç","ã","õ","Ã","Õ","â","ê","î","ô","û","Â","Ê","Î","Ô","Û"};

	public static byte[] convert(byte[] bytes, String encout) throws Exception {
		// Workaround for bug that will not be fixed by SUN
		// http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4508058
		UnicodeInputStream uis = new UnicodeInputStream(
				new ByteArrayInputStream(bytes), "ASCII");
		boolean unicodeOutputReqd = (getBOM(encout) != null) ? true : false;
		String enc = uis.getEncoding();
		String BOM = getBOM(enc); // get the BOM of the inputstream

		if (BOM == null) {
			// inputstream looks like ascii...
			// create a BOM based on the outputstream
			BOM = getBOM(encout);
		}
		uis.close();

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new ByteArrayInputStream(bytes, uis.getBOMOffset(),
						bytes.length), enc));
		Writer w = new BufferedWriter(new OutputStreamWriter(out, encout));

		// dont write a BOM for ascii(out) as the OutputStreamWriter
		// will not process it correctly.
		if (BOM != null && unicodeOutputReqd) {
			w.write(BOM);
		}

		char[] buffer = new char[4096];
		int len;
		while ((len = br.read(buffer)) != -1) {
			w.write(buffer, 0, len);
		}

		br.close(); // Close the input.
		w.close(); // Flush and close output.
		return out.toByteArray();
	}

	public static String getBOM(String enc) throws UnsupportedEncodingException {
		if ("UTF-8".equals(enc)) {
			byte[] bom = new byte[3];
			bom[0] = (byte) 0xEF;
			bom[1] = (byte) 0xBB;
			bom[2] = (byte) 0xBF;
			return new String(bom, enc);
		} else if ("UTF-16BE".equals(enc)) {
			byte[] bom = new byte[2];
			bom[0] = (byte) 0xFE;
			bom[1] = (byte) 0xFF;
			return new String(bom, enc);
		} else if ("UTF-16LE".equals(enc)) {
			byte[] bom = new byte[2];
			bom[0] = (byte) 0xFF;
			bom[1] = (byte) 0xFE;
			return new String(bom, enc);
		} else if ("UTF-32BE".equals(enc)) {
			byte[] bom = new byte[4];
			bom[0] = (byte) 0x00;
			bom[1] = (byte) 0x00;
			bom[2] = (byte) 0xFE;
			bom[3] = (byte) 0xFF;
			return new String(bom, enc);
		} else if ("UTF-32LE".equals(enc)) {
			byte[] bom = new byte[4];
			bom[0] = (byte) 0x00;
			bom[1] = (byte) 0x00;
			bom[2] = (byte) 0xFF;
			bom[3] = (byte) 0xFE;
			return new String(bom, enc);
		} else {
			return null;
		}

	}

	public static class UnicodeInputStream extends InputStream {
		private PushbackInputStream internalIn;

		private boolean isInited = false;

		private int BOMOffset = -1;

		private String defaultEnc;

		private String encoding;

		public static final int BOM_SIZE = 4;

		public UnicodeInputStream(InputStream in, String defaultEnc) {
			internalIn = new PushbackInputStream(in, BOM_SIZE);
			this.defaultEnc = defaultEnc;
		}

		public String getDefaultEncoding() {
			return defaultEnc;
		}

		public String getEncoding() {
			if (!isInited) {
				try {
					init();
				} catch (IOException ex) {
					IllegalStateException ise = new IllegalStateException(
							"Init method failed.");
					ise.initCause(ise);
					throw ise;
				}
			}
			return encoding;
		}

		/**
		 * Read-ahead four bytes and check for BOM marks. Extra bytes are unread
		 * back to the stream, only BOM bytes are skipped.
		 */
		protected void init() throws IOException {
			if (isInited)
				return;

			byte bom[] = new byte[BOM_SIZE];
			int n, unread;
			n = internalIn.read(bom, 0, bom.length);

			if ((bom[0] == (byte) 0x00) && (bom[1] == (byte) 0x00)
					&& (bom[2] == (byte) 0xFE) && (bom[3] == (byte) 0xFF)) {
				encoding = "UTF-32BE";
				unread = n - 4;
			} else if ((bom[0] == (byte) 0xFF) && (bom[1] == (byte) 0xFE)
					&& (bom[2] == (byte) 0x00) && (bom[3] == (byte) 0x00)) {
				encoding = "UTF-32LE";
				unread = n - 4;
			} else if ((bom[0] == (byte) 0xEF) && (bom[1] == (byte) 0xBB)
					&& (bom[2] == (byte) 0xBF)) {
				encoding = "UTF-8";
				unread = n - 3;
			} else if ((bom[0] == (byte) 0xFE) && (bom[1] == (byte) 0xFF)) {
				encoding = "UTF-16BE";
				unread = n - 2;
			} else if ((bom[0] == (byte) 0xFF) && (bom[1] == (byte) 0xFE)) {
				encoding = "UTF-16LE";
				unread = n - 2;
			} else {
				// Unicode BOM mark not found, unread all bytes
				encoding = defaultEnc;
				unread = n;
			}
			BOMOffset = BOM_SIZE - unread;
			if (unread > 0)
				internalIn.unread(bom, (n - unread), unread);

			isInited = true;
		}

		public void close() throws IOException {
			// init();
			isInited = true;
			internalIn.close();
		}

		public int read() throws IOException {
			// init();
			isInited = true;
			return internalIn.read();
		}

		public int getBOMOffset() {
			return BOMOffset;
		}
	}
	public static void main(String args[]) {
	    /*
		String patternString = "\".*\"";
	    String doubleQuotes = "\"";
	    */
	    System.out.println("Starting Charset source fix");
		String charsetFrom = "UTF-8";
		String charsetTo = charsetFrom;			
		File dir;
	    // in case you would like to ignore case sensitivity,
	    // you could use this statement:
	    // Pattern pattern = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
		try {
			
			if(args.length>0) {
				dir = new File(args[0].replaceAll("\\\\", "/"));
			} else {
				dir =  new File("C:/Users/rafael.lima/Desktop/DJ");
			}
			if(args.length>1) {
				charsetFrom = args[1];
			}
			if(args.length>2) {
				charsetTo = args[2];
			}
	        SourceFileSelector fileSelector = new SourceFileSelector();
			if(args.length>3) {
				if(args[3].toUpperCase().equals("TRUE")) {
					fileSelector.setSelectJspFiles(true);
				}
			}
			if(args.length>4) {
				if(args[4].toUpperCase().equals("TRUE")) {
					fileSelector.setSelectHtmlFiles(true);
				}
			}
			if(args.length>5) {
				if(args[5].toUpperCase().equals("TRUE")) {
					fileSelector.setSelectTxtFiles(true);
				}
			}
			
			System.out.println("Scan Path:"+dir.getAbsolutePath()+" from=" + charsetFrom + " to="+charsetTo);
			FileFinder finder = new FileFinder();
	        List<File> files = finder.findFilesFrom(dir.getAbsolutePath(),
                    new SourceFileOrDirectoryFilter(fileSelector), true);
			int count = 0;
			for(File file: files) {
				System.out.println("Fixing file:" +file.getAbsolutePath());
				String fileString = FileUtils.readFileAsString(file.getAbsolutePath()); 
				//byte[] out = UnicodeUtil.convert(fileString.getBytes(charsetFrom), charsetTo);
			    for(int i=0; i<noPrecision.length; i++) {
			      fileString = fileString.replace(noPrecision[i], precisonStrings[i]);
			    }
				if(fileString.indexOf("package")>=0) {
					fileString = fileString.substring(fileString.indexOf("package"));	
				}
			    //System.out.println(fileString);
				file.delete();
				FileOutputStream fos = new FileOutputStream(file.getAbsolutePath());
				
				Writer writer = new OutputStreamWriter(fos, charsetTo);
				writer.write(fileString);
				writer.close();
				fos.close();
				 				
				count++;
			}
			System.out.println("End of execution, total of fixed files="+count);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}