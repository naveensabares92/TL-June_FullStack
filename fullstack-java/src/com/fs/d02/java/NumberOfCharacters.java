package com.fs.d02.java;

public class NumberOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Input Arrays
		String[] arr1 = {"aa", "bb", "c", "dd"};
		String[] arr2 = {"aaa", "bb", "ccc", "ddd"};
		String[] arr3 = {"aaaa", "b", "c", "ddd"};
		
		getNumberOfCharacters(arr1, 2);
		getNumberOfCharacters(arr2, 1);
		getNumberOfCharacters(arr3, 4);
	}
	
	public static void getNumberOfCharacters(String[] arrayInput, int countToFind) {
		int counter = 0;
		
		for (String textUnderValidation : arrayInput) {
			if(textUnderValidation.length() == countToFind) {
				counter++;
			}
		}
		
		System.out.println("Number of Strings with " + countToFind + " characters are " + counter );	
	}

}
