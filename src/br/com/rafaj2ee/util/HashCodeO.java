package br.com.rafaj2ee.util;

public class HashCodeO {
	static int hash = 0;
	String key;
	
	public int hashCode() {
		return ++hash;
	}
	public boolean equals(Object o) {
		return ((HashCodeO) o).key.equals(this.key);
	}
}
