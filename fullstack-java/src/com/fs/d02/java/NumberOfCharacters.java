package com.fs.d02.java;

public class NumberOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"aa", "bb", "c", "dd"};
		int countToFind = 2;
		int counter = 0;
		for (String text : arr) {
			if(text.length() == countToFind) {
				counter++;
			}
		}
		
		System.out.println("Number of String with " + countToFind + " are " + counter );	
	}

}
