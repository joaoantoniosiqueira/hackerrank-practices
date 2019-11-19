package br.com.amplitude.tests.hackerrank;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class D2ArrayDSTest {
	
	@Test
	public void solutionTest() {
		int arr[][] = {{1, 1, 1, 0, 0, 0},
					   {0, 1, 0, 0, 0, 0},
					   {1, 1, 1, 0, 0, 0},
					   {0, 0, 2, 4, 4, 0},
					   {0, 0, 0, 2, 0, 0},
					   {0, 0, 1, 2, 4, 0}};
		
		
		assertEquals(19, D2ArrayDS.hourglassSum(arr));
	}
}