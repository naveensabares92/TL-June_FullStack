package com.fs.d04.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class GetDayOfWeekByNumber {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Day number to retrieve Day Name: \n");
		int numberOfDay = Integer.parseInt(reader.readLine());
		
		System.out.println("**** USING HASHMAP ****");
		if(numberOfDay <= 7 && numberOfDay > 0) {
			System.out.println("Using Map: " + initializeDaysOfWeekMap().get(numberOfDay) + "\n");			
		} else {
			System.out.println("Invalid input");
		}
		
		System.out.println("**** USING PREINITIALISED ARRAY ****");
		System.out.println("Using pre-initialised array: " + initializeDaysOfWeekArray(numberOfDay) + "\n");
		
		System.out.println("**** USING ARRAY CREATED BY NEW KEYWORD ****");
		System.out.println("Using array instantiated by NEW keyword: " + initializeDaysOfWeekNewArray(numberOfDay) + "\n");
	}

	public static HashMap<Integer, String> initializeDaysOfWeekMap() {
		HashMap<Integer, String> daysOfWeek = new HashMap<>();
		daysOfWeek.put(1, "Sun");
		daysOfWeek.put(2, "Mon");
		daysOfWeek.put(3, "Tue");
		daysOfWeek.put(4, "Wed");
		daysOfWeek.put(5, "Thur");
		daysOfWeek.put(6, "Fri");
		daysOfWeek.put(7, "Sat");
		
		return daysOfWeek;
	}
	
	public static String initializeDaysOfWeekArray(int numberOfDay) {
		String[] weekDay = {"Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"};
		String day = "";
		for(int i = 0; i<weekDay.length; i++) {
			if((numberOfDay-1) ==  i) {
				day =  weekDay[i];
			}
		}
		return day;	
	}
	
	public static String initializeDaysOfWeekNewArray(int numberOfDay) {
		String[] weekDay = new String[7]; 
		weekDay[0] = "Sun";
		weekDay[1] = "Mon";
		weekDay[2] = "Tue";
		weekDay[3] = "Wed";
		weekDay[4] = "Thur";
		weekDay[5] = "Fri";
		weekDay[6] = "Sat";
		
		String day = "";
		for(int i = 0; i<weekDay.length; i++) {
			if((numberOfDay-1) ==  i) {
				day =  weekDay[i];
			}
		}
		return day;	
	}
	
	
}
