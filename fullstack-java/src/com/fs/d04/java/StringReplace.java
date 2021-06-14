package com.fs.d04.java;

public class StringReplace {
	static char SYMBOLTOREPLACE = '+';
	
	public static void main(String[] args) {
		System.out.println("The Two strings to compare are 'New York' and 'New Jersey' \n\n");
		System.out.println("Output after replacing distinct char's in 1st input by '" + SYMBOLTOREPLACE + "' is: \n"+ compareAndReplace("New York", "New jersey"));
		
	}
	
	public static String compareAndReplace(String input1, String input2) {
		for (char i1 : input1.toLowerCase().toCharArray()) {
			if(!input2.toLowerCase().contains(String.valueOf(i1))) {
				input1 = input1.replace(i1, SYMBOLTOREPLACE);
			}
		}
		
		return input1;
	}
}
