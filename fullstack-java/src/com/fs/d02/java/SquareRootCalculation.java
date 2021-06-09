package com.fs.d02.java;

public class SquareRootCalculation {

	public static void main(String[] args) {
		double x1=5; 
		double x2=6; 
		double y1=8; 
		double y2=3;

		double resultingNumber;
		
		resultingNumber = ((x1+x2) * (x1+x2)) + ((y1+y2) * (y1+y2));
		int squareRoot = (int) (Math.sqrt(resultingNumber));
		
		System.out.println("Square root of " + resultingNumber + " "
				+ "converted to integer is: " + squareRoot);
		
		//To check on how to find square root not using Math functions
	}

}
