package com.fs.d02.java;

public class NumberOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] caseSensitiveVowels = getCaseSensitiveVowels();
		
		String strtoVerify = "NewyorkE iOU";
		int countOfVowels = 0;
		
		for (char alphabetUnderTest : strtoVerify.toCharArray()) {
			for(String vowelUnderTest: caseSensitiveVowels) {
				if(alphabetUnderTest == vowelUnderTest.charAt(0)) {
					countOfVowels++;
					break;
				}
			}
		}
		
		
		System.out.println("Total Vowels - " + countOfVowels);
		
		
	}
	
	public static String[] getCaseSensitiveVowels() {
		String[] vowels = {"a", "e", "i", "o", "u"};
		String[] newVowels = new String[10];
		
		for(int i = 0; i < vowels.length ; i++) {
			newVowels[i+i] = vowels[i];
			newVowels[i+i+1] = vowels[i].toUpperCase();
		}
		
		return newVowels;
	}

}
