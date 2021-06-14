package com.fs.d04.java;

public class StringEncryption {
	
	
	public static void main(String[] args) {
		System.out.println("Encrypted value: " + getEncryptedString("curiosity") + "\n");
		
		System.out.println("Encrypted value: " + getEncryptedString("Zemo Dimitri"));
	}
	
	
	public static String getEncryptedString(String unEncryptedStr) {

		System.out.println("Un-Encrypted value: " + unEncryptedStr);
		
		String ENCRYPTEDVALUE = "";
		char[] arr = unEncryptedStr.toCharArray();
		
		for(int i = 1; i <= arr.length; i++) {
			if(i%2 != 0) {
				arr[i-1] = getEncryptionChar(arr[i-1]);
			}
		}
		
		for (char c : arr) {
			ENCRYPTEDVALUE = ENCRYPTEDVALUE+String.valueOf(c);
		}
		
		return ENCRYPTEDVALUE;
	}
	
	public static char getEncryptionChar(char characterToEncrypt) {
		if(characterToEncrypt == ' ') {
			return ' ';
		} else if(characterToEncrypt == 'Z') {
			return 'A';
		} else if(characterToEncrypt == 'z' ) {
			return 'a';
		} else {
			return ++characterToEncrypt;
		}
	}
}
