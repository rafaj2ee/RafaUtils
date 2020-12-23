package br.com.rafaj2ee.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;

public class SerialFix {

	private static final String START_LOG = "Starting serialVersionUID source fix";
	private static final String NEXT_LINE = "\n";

	public static void main(String args[]) {
		System.out.println(START_LOG);
		String charsetFrom = "UTF-8";
		String charsetTo = charsetFrom;			
		File dir;
		try {			
			if(args.length>0) {
				dir = new File(args[0].replaceAll("\\\\", "/"));
			} else {
				dir =  new File("D:/Users/rafaellima/Dropbox/VirtualHairColorist");
			}
			if(args.length>1) {
				charsetFrom = args[1];
			}
			if(args.length>2) {
				charsetTo = args[2];
			}
			String scanPath = "Scan Path:"+dir.getAbsolutePath()+" from=" + charsetFrom + " to="+charsetTo;
			System.out.println(scanPath);
			FileFinder finder = new FileFinder();
	        SourceFileSelector fileSelector = new SourceFileSelector();
			List<File> files = finder.findFilesFrom(dir.getAbsolutePath(),
                    new SourceFileOrDirectoryFilter(fileSelector), true);
			
			FileOutputStream log = new FileOutputStream(dir.getAbsolutePath()+"/SerialFix.txt");
			
			Writer logWriter = new OutputStreamWriter(log, charsetTo);
			logWriter.write(START_LOG+NEXT_LINE);
			logWriter.write(scanPath+NEXT_LINE);
			long count = 0;
			for(File file: files) {
				System.out.println("Fixing file:" +file.getAbsolutePath());
				String fileString = FileUtils.readFileAsString(file.getAbsolutePath()); 
			    if(fileString.indexOf("serialVersionUID")!=-1) {
			    	String testando =  fileString.substring(fileString.indexOf("serialVersionUID"), fileString.indexOf("serialVersionUID")+fileString.substring(fileString.indexOf("serialVersionUID")).indexOf(";"));
			    	String newSerial = "serialVersionUID = " + (count+1) + "L";
			    	fileString = fileString.replace(testando, newSerial);
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
			logWriter.write("End of execution, total of fixed files="+count);
			logWriter.flush();
			logWriter.close();
			log.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}