package br.com.amplitude.tests.exercises;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HourglassMatrizTest {

	@Test
	public void hourglassTest() {
		int [][] mat = {{1, 2, 3, 0, 0}, 
                	    {0, 0, 0, 0, 0}, 
                        {2, 1, 4, 0, 0}, 
                        {0, 0, 0, 0, 0}, 
                        {1, 1, 0, 1, 0}};
		
		assertEquals(13, HourglassMatriz.findMaxSum(mat));
	}
}
