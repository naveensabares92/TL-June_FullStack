package com.fs.d04.java;

public class ArrayMultiplyPositionIndex {
	
	public static void main(String[] args) {
		int[] inputArr = {3, 6, 2, 1}; 
		
		System.out.println("Sum of Power of each individual element in input array:  " + getSumOfPowerIndexArr(inputArr));
	}
	
	public static int getSumOfPowerIndexArr(int[] input) {
		int sumOfPowerIndex = 0;
		
		for(int i = 0; i < input.length; i++) {
			sumOfPowerIndex = sumOfPowerIndex + (input[i] * i);
		}
		
		return sumOfPowerIndex;
	}
	
}
