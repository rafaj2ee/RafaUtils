package br.com.rafaj2ee.util;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

import br.com.rafaj2ee.util.Solution;
@RunWith(Parameterized.class)
public class TestSolution {
	private String value;
	private boolean result; 
   @Parameters
   public static Iterable<Object[]> data()  {
      return Arrays.asList(new Object[][] {
         { "abcde", true },
         { "abcbe", false },
      });
   }
   
    public TestSolution(String value, boolean bool) {
    	this.value = value;
    	result = bool;
    }
	@Test
	public void test() {
		Solution resolution = new SolutionImplementation();
		assertEquals(resolution.isUnique(value), result);
	}

}
