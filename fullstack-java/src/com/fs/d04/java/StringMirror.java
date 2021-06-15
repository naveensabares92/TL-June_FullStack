package com.fs.d04.java;

public class StringMirror {

	public static void main(String[] args) {
		
		String input = "EARTH";
		System.out.println("Mirror Image of "+ input + " with '|' symbol:  " + getImage(input));
		
	}
	
	public static String getImage(String str) {
		String reverseStr = "";
		
		for(int i = str.toCharArray().length-1; i >= 0; i--) {
			reverseStr = reverseStr + String.valueOf(str.charAt(i));
		}
		
		return str + "|" + reverseStr;
	}
}
