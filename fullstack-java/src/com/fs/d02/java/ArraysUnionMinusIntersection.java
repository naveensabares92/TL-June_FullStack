package com.fs.d02.java;

public class ArraysUnionMinusIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,10};
		int[] arr2 = {3,4,5,6,10};

		String[] unionArr =  ArraysUnion.getUnionOfArrays(arr1, arr2);
		String[] interSectionArr = ArraysIntersection.getInterSectionOfArrays(arr1, arr2);
		
		
		String s = "";
		for (String unionVal : unionArr) {
			s = (s + " " + unionVal).trim();
		}
	
		
		for (String commonVal : interSectionArr) {
			if (s.contains(commonVal)) {
				s = s.replace(commonVal, "").replaceAll("  ", " ").trim();
			}
		}
		
		System.out.println("[(Array1 U Array2) - (Array1 N Array2)]: " + s);
	}
}