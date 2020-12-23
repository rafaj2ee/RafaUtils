package br.com.rafaj2ee.util;

public class TestString {
	public static void main(String args[]) {
		System.out.println("teste "+isNullOrEmpty("jhds"));
	}

	public static boolean isNullOrEmpty(String str) {
		return "".equals(str);
    }
}