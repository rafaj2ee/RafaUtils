package br.com.rafaj2ee.util;

public class MyThread extends Thread {
	String sa;
	public MyThread(String sa) {
		this.sa = sa;
	}
	public void run() {
		synchronized (sa) {
			while(!sa.equals("Done")) {
				try {
					sa.wait();
				} catch (InterruptedException ie)
				{
					ie.printStackTrace();
				}
			}			
		}
		System.out.println(sa);
	}
}
