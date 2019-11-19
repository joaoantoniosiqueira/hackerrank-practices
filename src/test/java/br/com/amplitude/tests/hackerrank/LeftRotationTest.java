package br.com.amplitude.tests.hackerrank;

import org.junit.Test;

public class LeftRotationTest {
	
	@Test
	public void hanckerrank() {
		
		int[] a = {1, 2, 3, 4, 5};
		int[] rotationArray = LeftRotation.rotLeft(a, 4);
		
		for (int i : rotationArray) {
			System.out.println(i );
		}
	}

}
