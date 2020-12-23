package br.com.rafaj2ee.util;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;

import com.googlecode.zohhak.api.TestWith;
import com.googlecode.zohhak.api.runners.ZohhakRunner;

import br.com.rafaj2ee.util.Solution;
@RunWith(ZohhakRunner.class)
public class TestSolutionZohhak {

	@TestWith({
	    "abcde, true",
	    "abcbe, false"
	})
	public void test(String value, boolean result) {
		Solution resolution = new SolutionImplementation();
		assertEquals(resolution.isUnique(value), result);
	}

}
