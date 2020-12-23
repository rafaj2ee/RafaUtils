package br.com.rafaj2ee.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StupidTest {
	public static final SimpleDateFormat FORMATO_DATA_PADRAO = new SimpleDateFormat("dd/MM/yyyy");
	public static void main(String[] args) {
		long test = 0;
		try {
			test = FORMATO_DATA_PADRAO.parse("01/01/1950").getTime();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(test);

	}

}
