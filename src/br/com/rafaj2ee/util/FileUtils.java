package br.com.rafaj2ee.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileUtils {
	public static String readFileAsString(String filePath) throws java.io.IOException{
	    byte[] buffer = new byte[(int) new File(filePath).length()];
	    BufferedInputStream f = new BufferedInputStream(new FileInputStream(filePath));
	    f.read(buffer);
	    f.close();
	    return new String(buffer);
	}
	public static String readFileAsString(String filePath, String charset) throws java.io.IOException{
		StringBuffer sb = new StringBuffer();
	    InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), charset);

	    int c = 0;

	    while ((c = isr.read()) != -1){
	    	sb.append((char) c);
	    }
	    isr.close();
	    return sb.toString();
	}
}
