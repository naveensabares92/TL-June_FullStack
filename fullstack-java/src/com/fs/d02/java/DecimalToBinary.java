package com.fs.d02.java;

public class DecimalToBinary {

	public static void main(String[] args) {
		int decimalNo = 12;
		String booleanNumber = "";
		
		while(decimalNo!=0) {
			if(decimalNo%2 == 0) {
				booleanNumber = booleanNumber + 0;
			}
			if(decimalNo%2 == 1) {
				booleanNumber = booleanNumber + 1;
			}
			decimalNo = decimalNo/2;
		}
		
		char[] actualNo = new char[booleanNumber.toCharArray().length];
		for (int i = booleanNumber.toCharArray().length - 1; i >= 0; i--) {
			actualNo[i] = booleanNumber.toCharArray()[(booleanNumber.toCharArray().length-1)-i];
		}
		
		System.out.print("Boolean equivalent is: " );       
		System.out.print(actualNo);
	}
}
