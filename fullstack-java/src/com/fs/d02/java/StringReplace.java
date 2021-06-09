package com.fs.d02.java;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]  inputArr={"abc","da","ram"};
		char toReplace = '$';
		int positionToReplace = 2;
		char[] thirdCharArr = new char[inputArr.length];
		//Created object of Class as the method is not static
		StringReplace obj = new StringReplace();
	
		for(int i = 0; i < inputArr.length; i++) {
			thirdCharArr[i] = obj.replaceCharInArrayByPosition(inputArr[i], toReplace, positionToReplace);
		}
		
		System.out.println(String.valueOf(thirdCharArr));
	}
	
	public char replaceCharInArrayByPosition(String inputArray, char charToReplace, int characterReplacementPosition) {
		if(inputArray.length() >= 3) {
			return inputArray.charAt(characterReplacementPosition);
		} else {
			inputArray = inputArray + "$";
			return inputArray.charAt(characterReplacementPosition); 
		}
	}
}
