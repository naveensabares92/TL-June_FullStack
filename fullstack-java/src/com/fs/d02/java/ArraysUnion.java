package com.fs.d02.java;

public class ArraysUnion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {3,4,5,6};

		String[] unionArr = getUnionOfArrays(arr1, arr2);

		System.out.println("Union of 2 arrays are: ");
		for (String unionValue : unionArr) {
			System.out.println(unionValue + "\n");
		}
	}
	
	public static String[] getUnionOfArrays(int[] input1, int[] input2) {
		String s = "";
		for (int i : input1) {
			s = s + " " +  String.valueOf(i);
		}
		
		for (int j : input2) {
			if(!s.contains(String.valueOf(j))){
					s = s + " " + String.valueOf(j);
				}
		}

		String[] outputArr = s.split(" ");
		
		return outputArr;
	}
}
