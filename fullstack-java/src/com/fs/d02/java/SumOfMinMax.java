package com.fs.d02.java;

public class SumOfMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {199, 129, 1221, 121, 19, 210};
		int maximumNo = 0;
		int minimumNo = 0;
		for(int i = 0; i < arr.length; i ++){
			if(i == 0) {
				minimumNo = arr[i];
				maximumNo = arr[i];
			} else {
				if(arr[i] < minimumNo) {
					minimumNo = arr[i];
				} else if(arr[i] > maximumNo) {
					maximumNo = arr[i];
				}
			}
			
			
		}
		System.out.println("Max - " + maximumNo);
		System.out.println("Min - " + minimumNo);
		
		System.out.println("Sum of Min & Max - " + (minimumNo + maximumNo));
	}

}
