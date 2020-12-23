package br.com.rafaj2ee.util;

import java.util.HashMap;

public class HashTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap test = new HashMap();
		HashCodeO hash1 = new HashCodeO();
		hash1.key = "hash1";
		HashCodeO hash2 = new HashCodeO();
		hash2.key = "hash2";
		HashCodeO hash3 = new HashCodeO();
		hash3.key = "hash1";
		HashCodeO hash4 = new HashCodeO();
		hash4.key = "hash2";
		test.put(hash1, "hash1");
		test.put(hash2, "hash2");
		test.put(hash3, "hash3");
		test.put(hash4, "hash4");
		System.out.println(test.size()+"|"+ (hash2.equals(hash4)));
	}
	

}
