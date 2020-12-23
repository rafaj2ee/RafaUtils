package br.com.rafaj2ee.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.channels.FileChannel;

public class MavenFix {

	private static final String START_LOG = "Starting Maven lib copy";
	private static final String NEXT_LINE = "\n";
	private static final String charsetTo = "UTF-8";
	
	public static void main(String args[]) {
		System.out.println(START_LOG);
		String libs[] = {"C:/Users/rafael.lima/.m2/repository/org/springframework/spring-aop/2.5.6/spring-aop-2.5.6.jar"
				,"C:/Users/rafael.lima/.m2/repository/aopalliance/aopalliance/1.0/aopalliance-1.0.jar"
				,"C:/Users/rafael.lima/.m2/repository/commons-logging/commons-logging/1.1.1/commons-logging-1.1.1.jar"
				,"C:/Users/rafael.lima/.m2/repository/org/springframework/spring-beans/2.5.6/spring-beans-2.5.6.jar"
				,"C:/Users/rafael.lima/.m2/repository/org/springframework/spring-context-support/2.5.6/spring-context-support-2.5.6.jar"
				,"C:/Users/rafael.lima/.m2/repository/org/springframework/spring-context/2.5.6/spring-context-2.5.6.jar"
				,"C:/Users/rafael.lima/.m2/repository/org/springframework/spring-core/2.5.6/spring-core-2.5.6.jar"
				,"C:/Users/rafael.lima/.m2/repository/org/springframework/spring-jdbc/2.5.6/spring-jdbc-2.5.6.jar"
				,"C:/Users/rafael.lima/.m2/repository/org/springframework/spring-jms/2.5.6/spring-jms-2.5.6.jar"
				,"C:/Users/rafael.lima/.m2/repository/commons-pool/commons-pool/1.3/commons-pool-1.3.jar"
				,"C:/Users/rafael.lima/.m2/repository/org/springframework/spring-orm/2.5.6/spring-orm-2.5.6.jar"
				,"C:/Users/rafael.lima/.m2/repository/org/springframework/spring-test/2.5.6/spring-test-2.5.6.jar"
				,"C:/Users/rafael.lima/.m2/repository/junit/junit/3.8.1/junit-3.8.1.jar"
				,"C:/Users/rafael.lima/.m2/repository/org/springframework/spring-tx/2.5.6/spring-tx-2.5.6.jar"
				,"C:/Users/rafael.lima/.m2/repository/org/springframework/spring-web/2.5.6/spring-web-2.5.6.jar"
				,"C:/Users/rafael.lima/.m2/repository/org/springframework/spring-webmvc/2.5.6/spring-webmvc-2.5.6.jar"
				,"C:/Users/rafael.lima/.m2/repository/commons-dbcp/commons-dbcp/1.2.2/commons-dbcp-1.2.2.jar"
				,"C:/Users/rafael.lima/.m2/repository/commons-fileupload/commons-fileupload/1.2.1/commons-fileupload-1.2.1.jar"
				,"C:/Users/rafael.lima/.m2/repository/org/apache/ibatis/ibatis-sqlmap/2.3.4.726/ibatis-sqlmap-2.3.4.726.jar"
				,"C:/Users/rafael.lima/.m2/repository/javax/servlet/servlet-api/2.4/servlet-api-2.4.jar"
				,"C:/Users/rafael.lima/.m2/repository/javax/servlet/jstl/1.1.2/jstl-1.1.2.jar"
				,"C:/Users/rafael.lima/.m2/repository/taglibs/standard/1.1.2/standard-1.1.2.jar"
				,"C:/Users/rafael.lima/.m2/repository/org/aspectj/aspectjweaver/1.6.8/aspectjweaver-1.6.8.jar"
				,"C:/Users/rafael.lima/.m2/repository/log4j/log4j/1.2.12/log4j-1.2.12.jar"};	
		File dir;
		try {			
			if(args.length>0) {
				dir = new File(args[0].replaceAll("\\\\", "/"));
			} else {
				dir =  new File("C:/Users/rafael.lima/workspace/dig-mail/WebContent/WEB-INF/lib/");
			}
			if(args.length>1) {
				libs = args[1].replaceAll("\\\\", "/").split(",");
			}
			
			String scanPath = "Copy Libs to:"+dir.getAbsolutePath();
			System.out.println(scanPath);
			FileOutputStream log = new FileOutputStream(dir.getAbsolutePath()+"/MavenFix.txt");
						
			Writer logWriter = new OutputStreamWriter(log, charsetTo);
			logWriter.write(START_LOG+NEXT_LINE);
			logWriter.write(scanPath+NEXT_LINE);

			
			long count = 0;
			
			for(String lib : libs ) {
				File arquivo = new File(lib);
				if(arquivo.canRead()) {
					String stringFileTo = dir.getAbsolutePath()+lib.substring(lib.lastIndexOf("/"));
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