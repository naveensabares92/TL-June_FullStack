package com.fs.d02.java;

public class DuplicateCharInString {

	public static void main(String[] args) {
		String originalStr = "helloworld";
		
		char[] arr = originalStr.toCharArray();
		String distinctStr = "";

		for(int i = 0; i < arr.length; i++) {
			for(int j =0; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					if(!distinctStr.contains(String.valueOf(arr[i]))) {
						distinctStr = distinctStr + String.valueOf(arr[i]);						
					}
					break;
				}
			}

		}
		
		System.out.println("String "+ originalStr + " after removing duplicate characters is: " + distinctStr);
	}

}
