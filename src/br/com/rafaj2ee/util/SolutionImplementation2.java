package br.com.rafaj2ee.util;


import java.util.Arrays;

import br.com.rafaj2ee.util.Solution2;

public class SolutionImplementation2 implements Solution2 {

	public int candy(int[] ratings) {
		Arrays.sort(ratings);
		int min = ratings[0];
		int increased = 0;
		int total = ratings.length;
		for(int i = 0; i<ratings.length;i++) {
			if(ratings[i]>min) {
				min = ratings[i];
				increased++;
				total+=increased;
			}
		}
		return total;
	}

}
