package br.com.rafaj2ee.util;


import br.com.rafaj2ee.util.Solution;

public class SolutionImplementation implements Solution {
	public boolean isUnique(String value) {
		for(int i = 0; i<value.length(); i++) {
			for(int i1 = 0; i1<value.length(); i1++) {
				if(i!=i1 && value.charAt(i)==value.charAt(i1)) {
					return false;
				}
			}
		}
		return true;
	}
}
