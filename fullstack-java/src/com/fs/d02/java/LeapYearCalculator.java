package com.fs.d02.java;

public class LeapYearCalculator {

	public static void main(String[] args) {
		int yearToCheck = 2020;
		boolean isLeapYear = false;
		
		isLeapYear = ((yearToCheck % 4) == 0) ? true : false;
		
		if(isLeapYear) {
			System.out.println("Year: " + yearToCheck + " is a leap year");
		} else {
			System.out.println("Year: " + yearToCheck + " is not a leap year");
		}
	}

}
