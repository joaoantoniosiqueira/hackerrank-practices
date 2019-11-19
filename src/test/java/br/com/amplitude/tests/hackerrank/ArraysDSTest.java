package br.com.amplitude.tests.hackerrank;

import org.junit.Test;

public class ArraysDSTest {

	@Test
	public void solutionTest() {
		int[] a = {1, 4, 3, 2};
		int[] inverseArray = ArraysDS.reverseArray(a);
		
		for(int i = 0; i < inverseArray.length; i++)
		{
			System.out.println(inverseArray[i]);
		}
	}
}
