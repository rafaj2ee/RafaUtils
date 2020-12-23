package br.com.rafaj2ee.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.rafaj2ee.util.Solution2;

public class TestSingleSolution2 {

	@Test
	public void test() {
		Solution2 solution = new SolutionImplementation2();
		assertEquals(solution.candy(new int[]{8, 6, 9 , 6}), 7);
	}

}
