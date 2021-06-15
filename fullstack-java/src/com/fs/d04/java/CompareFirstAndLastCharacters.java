package com.fs.d04.java;

public class CompareFirstAndLastCharacters {
	
	final static int COMPARISONTRUE = 1;
	final static int COMPARISONFALSE = -1;
	
	public static void main(String[] args) {
		String input = "the picture was great";	
		
		System.out.println("Comparison result of first & last characters:  " + getComparisonResultOfString(input));
	}
	
	public static int getComparisonResultOfString(String inputStr) {
		if(inputStr.charAt(0) == inputStr.charAt(inputStr.length() - 1)) {
			return COMPARISONTRUE;
		} else {
			return COMPARISONFALSE;
		}
	}
}
