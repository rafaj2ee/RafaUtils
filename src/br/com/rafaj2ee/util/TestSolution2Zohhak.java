package br.com.rafaj2ee.util;

import static org.junit.Assert.*;
import com.googlecode.zohhak.api.*;
import org.junit.runner.RunWith;
import com.googlecode.zohhak.api.runners.ZohhakRunner;

import br.com.rafaj2ee.util.Solution;
import br.com.rafaj2ee.util.Solution2;

import org.junit.Test;
@RunWith(ZohhakRunner.class)
public class TestSolution2Zohhak {

	@TestWith(value = {
	    "{8, 6, 9 , 6}| 7",
	    "{8,6,9,7,6}| 11"
	}, separator="[\\|]")
	public void test(int[] ratings, int result) {
		Solution2 solution = new SolutionImplementation2();
		assertEquals(solution.candy(ratings), result);
	}
	@Coercion
	public int[] getRatings(String input) {
		String[] inputs = input.split(",");
		inputs[0] = inputs[0].substring(1);
		inputs[inputs.length-1] = inputs[inputs.length-1].substring(0, inputs[inputs.length-1].length()-1);
		int[] ratings = new int[inputs.length];
		for(int i = 0; i<inputs.length; i++) {
			ratings[i] = Integer.parseInt(inputs[i].trim());
		}
		return ratings;
	}
}
