package br.com.rafaj2ee.util;

public class MyThreadTest {
	private static String sa = new String("Not Done");
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t1 = new MyThread(sa);
		t1.start();
		synchronized (sa) {
			sa = new String("Done");
			sa.notify();
		}
	}

}
