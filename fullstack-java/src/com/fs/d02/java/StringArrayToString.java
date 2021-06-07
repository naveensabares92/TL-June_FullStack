package com.fs.d02.java;

public class StringArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input1={"Vikas","Lokesh","Ashok"};
		String arrayToStr = "";
		
		for (String str : input1) {
			arrayToStr = arrayToStr + " " + str.toString();
		}
		System.out.println("String Array converted to String is: " + arrayToStr);
	}

}
