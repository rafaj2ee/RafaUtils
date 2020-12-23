package br.com.rafaj2ee.util;

public class AssertTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			try {
				assert i%2==0 : i--;
				System.out.println("Even number : " +i);
			} catch (AssertionError ae) {
				System.out.println("Odd number : " + ++i);
			}
		}
	}

}
