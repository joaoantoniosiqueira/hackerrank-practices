package br.com.amplitude.tests.exercises;

public class HourglassMatriz {
	
	static int findMaxSum(int[][] arr) {
		int max_sum = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length - 2; i++) 
		{
			for(int j = 0; j < arr.length - 2; j++)
			{
				int sum = (arr[i][j] + arr[i][j + 1] + arr[i][j + 2]) + arr[i + 1][j + 1] + (arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]);
				max_sum = Math.max(max_sum, sum);
			}
			
		}
		return max_sum;
	}
}
