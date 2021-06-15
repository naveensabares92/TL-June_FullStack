package com.fs.d04.java;

public class SumOfNaturalNumbersDivisible {
	
	static int n = 10;
	
	public static void main(String[] args) {
		SumOfNaturalNumbersDivisible obj = new SumOfNaturalNumbersDivisible();
		System.out.println("Sum of " + n + " natural numbers that are divisible by 3 OR 5: " + obj.calculateSum(n));
	}
	
	public int calculateSum(int numberOfNaturalNos) {
		int sum = 0;
		int naturalNoCount = 1;
		int i = 1;
		while(naturalNoCount <= numberOfNaturalNos) {
			if((i%3 == 0) || (i%5 == 0)) {
				sum = sum + i;
				naturalNoCount++;
			}
			i++;
		}
		return sum;
	}
}

