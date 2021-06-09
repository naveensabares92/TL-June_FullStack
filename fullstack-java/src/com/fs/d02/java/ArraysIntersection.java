package com.fs.d02.java;

public class ArraysIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,10};
		int[] arr2 = {3,4,5,6,10};
		
		String[] interSectionArr = getInterSectionOfArrays(arr1, arr2);

		System.out.println("Intersection of 2 arrays are: ");
		for (String intersectionVal : interSectionArr) {
			System.out.println(intersectionVal + "\n");
		}
	}
	
	public static String[] getInterSectionOfArrays(int[] input1, int[] input2) {
		String s = "";
		String s1 = "";
		
		for (int i : input1) {
			s = s + " " +  String.valueOf(i);
		}
		
		for (int j : input2) {
			if(s.contains(String.valueOf(j))){
					s1 = s1 + " " +  String.valueOf(j);
				}
		}

		String[] outputArr = s1.split(" ");
		return outputArr;
	}
}
