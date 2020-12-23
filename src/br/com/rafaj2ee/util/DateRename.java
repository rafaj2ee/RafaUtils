package br.com.rafaj2ee.util;

import java.io.File;
import java.util.Calendar;

public class DateRename {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar data = Calendar.getInstance();
		
		String outDir = args[1]+"_"+data.get(Calendar.YEAR)+"_"+data.get(Calendar.MONTH)+"_"+data.get(Calendar.DAY_OF_MONTH);
		System.out.println("Renaming from "+args[0]+" to "+outDir);
		File arquivo = new File(args[0]);
		if(arquivo.canWrite()) {
			File dest = new File(outDir);
			arquivo.renameTo(dest);
		}
		System.out.println("Renamed");
	}
}
