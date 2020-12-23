package br.com.rafaj2ee.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.channels.FileChannel;

public class SourceCopy {

	private static final String START_LOG = "Starting Maven lib copy";
	private static final String NEXT_LINE = "\n";
	private static final String charsetTo = "ISO-8859-1";
	
	public static void main(String args[]) {
		System.out.println(START_LOG);
		String libs[] = {"C:/SJRP_SBE/sgg/cooperlotacao/PortalComprador/ModeloCorGrid.png"
				,"C:/SJRP_SBE/sgg/cooperlotacao/PortalComprador/src/br/com/digicon/portalcomprador/dao/ibatis/maps/CompradorCartao.xml"
				,"C:/SJRP_SBE/sgg/cooperlotacao/PortalComprador/src/br/com/digicon/portalcomprador/dao/ibatis/CompradorCartaoDaoImpl.java"
				,"C:/SJRP_SBE/sgg/cooperlotacao/PortalComprador/src/br/com/digicon/portalcomprador/dao/CompradorCartaoDao.java"
				,"C:/SJRP_SBE/sgg/cooperlotacao/PortalComprador/src/br/com/digicon/portalcomprador/util/UserSessionUtil.java"
				,"C:/SJRP_SBE/sgg/cooperlotacao/PortalComprador/src/br/com/digicon/portalcomprador/web/controller/LoginController.java"
				,"C:/SJRP_SBE/sgg/cooperlotacao/PortalComprador/src/br/com/digicon/portalcomprador/web/controller/ItemPedidoController.java"
				,"C:/SJRP_SBE/sgg/cooperlotacao/PortalComprador/src/br/com/digicon/portalcomprador/service/CompradorCartaoService.java"
				,"C:/SJRP_SBE/sgg/cooperlotacao/PortalComprador/src/br/com/digicon/portalcomprador/service/impl/ParametroServiceImpl.java"
				,"C:/SJRP_SBE/sgg/cooperlotacao/PortalComprador/src/br/com/digicon/portalcomprador/service/impl/CompradorCartaoServiceImpl.java"};	
		String dir;
		try {			
			if(args.length>0) {
				dir = args[0].replaceAll("\\\\", "/");
			} else {
				dir =  "C:/Users/rafael.lima/workspace/PortalComprador";
			}
			if(args.length>1) {
				libs = args[1].replaceAll("\\\\", "/").split(",");
			}
			
			String scanPath = "Copy Libs to:"+dir;
			System.out.println(scanPath);
			FileOutputStream log = new FileOutputStream(dir+"/SourceCopy.txt");
						
			Writer logWriter = new OutputStreamWriter(log, charsetTo);
			logWriter.write(START_LOG+NEXT_LINE);
			logWriter.write(scanPath+NEXT_LINE);

			
			long count = 0;
			String dirsTo[] = dir.split("/");
			String baseDir = dirsTo[dirsTo.length-1];			

			for(String lib : libs ) {
				File arquivo = new File(lib);
				if(arquivo.canRead()) {		
					String stringFileTo = dir+lib.substring(lib.indexOf(baseDir)+baseDir.length());
					System.out.println(stringFileTo);
					File fileTo = new File(stringFileTo);
				    FileChannel sourceChannel = null;
				    FileChannel destChannel = null;
					try {
					    sourceChannel = new FileInputStream(arquivo).getChannel();
					    destChannel = new FileOutputStream(fileTo).getChannel();
					    destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
					    logWriter.write(arquivo.getAbsolutePath()+" (copied to) "+fileTo.getAbsolutePath()+"\n");
					    System.out.print(arquivo.getAbsolutePath()+" (copied to) "+fileTo.getAbsolutePath()+"\n");
						count++;
					} finally {
				       sourceChannel.close();
				       destChannel.close();
				    }						
				}			
			}
			System.out.println("End of execution, total of files copied="+count);
			logWriter.write("End of execution, total of files copied="+count);
			logWriter.flush();
			logWriter.close();
			log.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}