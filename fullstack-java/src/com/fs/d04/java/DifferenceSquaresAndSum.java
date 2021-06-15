package com.fs.d04.java;

public class DifferenceSquaresAndSum {

	public static void main(String[] args) {
		
		int input = 10; 
		System.out.println("Difference between sum of the squares of first " + input + " natural numbers "
				+ "and the square of their sum is: " + calculateDifference(input));
		
	}

	public static int calculateDifference(int n) {
		int squareSum = 0;
		int sumSquare = 0;
		int i = 1;
		
		while(i <= n) {
			squareSum = squareSum + (i * i);
			sumSquare = sumSquare + i;
			i++;
		}
		
		return squareSum - (sumSquare * sumSquare);
	}
}
