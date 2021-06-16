package com.fs.d04.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LabMaxCapacity {

	public static void main(String[] args) {
		int capacityLabL1 = 0;
		int capacityLabL2 = 0;
		int capacityLabL3 = 0;
		  // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
 
		try {
			System.out.println("Enter capacity for CSE Lab 1: ");
			capacityLabL1 = Integer.parseInt(reader.readLine());
			
			System.out.println("Enter capacity for CSE Lab 2: ");
			capacityLabL2 = Integer.parseInt(reader.readLine());
			
			System.out.println("Enter capacity for CSE Lab 3: ");
			capacityLabL3 = Integer.parseInt(reader.readLine());
		
		} catch (IOException e) {
			e.printStackTrace();
		} catch(NumberFormatException e) {
			System.out.println("Please enter the lab capacity in natural numbers only");
		}
 
        // Printing the read line
        System.out.println("Minimum Seating Capacity among the 3 CSE Labs: " + getMinimumCapacity(capacityLabL1, capacityLabL2, capacityLabL3));
	}
	
	public static int getMinimumCapacity(int capacityLabL1, int capacityLabL2, int capacityLabL3) {
		return Math.min(Math.min(capacityLabL1, capacityLabL2), capacityLabL3);
	}
}
