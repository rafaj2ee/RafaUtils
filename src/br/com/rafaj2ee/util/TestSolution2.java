package br.com.rafaj2ee.util;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import br.com.rafaj2ee.util.Solution2;
@RunWith(Parameterized.class)
public class TestSolution2 {
	private int[] ratings;
	private int result; 
   @Parameters
   public static Iterable<Object[]> data()  {
      return Arrays.asList(new Object[][] {
         { new int[]{8, 6, 9 , 6}, 7 },
         { new int[]{8,6,9,7,6}, 11 },
      });
   }
   public TestSolution2(int[] ratings, int result) {
	   this.ratings = ratings;
	   this.result = result;
   }
	@Test
	public void test() {
		Solution2 solution = new SolutionImplementation2();
		assertEquals(solution.candy(ratings), result);
	}	

}
