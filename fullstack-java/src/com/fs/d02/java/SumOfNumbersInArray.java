package com.fs.d02.java;

public class SumOfNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"2AA","12","ABC","c1a"};
		System.out.println("Total value of numbers in the array using Character inbuilt fn is: "  + getNumbersInArray(arr));

	}
	
	public static int getNumbersInArray(String arr[]) {
		int total = 0, patternTotal = 0;
		String regexPattern = "^[0-9]";
		
		for (String str : arr) {
			for(char c : str.toCharArray()) {
				if(Character.isDigit(c)) {
					total = total + Character.getNumericValue(c);
				}

				// Verify using pattern matcher (regex)
				if(Character.toString(c).matches(regexPattern)) {
					patternTotal = patternTotal + Character.getNumericValue(c);
				}
			}			
		}
		System.out.println("Total value of numbers in the array using REGEX (pattern matcher) is: " + patternTotal);
		return total;
	}
}
