package com.fs.d02.java;

public class NumberOfVowels {

	public static void main(String[] args) {
		
		String strtoVerify = "NewyorkE iOU";
		String[] vowels = {"a", "e", "i", "o", "u"};
		int countOfVowels = 0;

		for(String vowelUnderTest: vowels) {
			for (char alphabetUnderTest : strtoVerify.replace(" ","").toLowerCase().toCharArray()) {
				if(alphabetUnderTest == vowelUnderTest.charAt(0)) {
					countOfVowels++;
					break;
				}
			}	
		}
		
		System.out.println("Total # of vowels - " + countOfVowels);		
	}
}