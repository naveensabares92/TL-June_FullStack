package com.fs.d04.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RedCross {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number of tents: ");
		int noOfTents = Integer.parseInt(reader.readLine());
		

		int[] tentCapacity = new int[noOfTents];
		int totalCapacity = 0;
		
		for(int i = 0; i<noOfTents; i++) {
			System.out.println("Enter the capacity in each tent "+ (i+1) + " : ");
			tentCapacity[i] = Integer.parseInt(reader.readLine());
		}
		
		System.out.println("Capacity in Each Tent: ");
		for(int i = 0; i<noOfTents; i++) {
			System.out.println("Capacity in tent "+ (i+1) + ": " + tentCapacity[i]);
		}
		
		
		System.out.println("*** TOTAL REFUGES IN ALL CAMPS USING FOR EACH LOOP ***");
		for (int i : tentCapacity) {
			totalCapacity = totalCapacity + i;
		}
		
		System.out.println("Total Capacity in the Red cross refuge tents using FOR EACH: " + totalCapacity + "\n");
		
		totalCapacity = 0;
		
		System.out.println("*** TOTAL REFUGES IN ALL CAMPS USING WHILE LOOP ***");
		int j = 0;
		while (j < noOfTents) {
			totalCapacity = totalCapacity + tentCapacity[j];
			j++;
		}
		
		System.out.println("Total Capacity in the Red cross refuge tents using WHILE LOOP: " + totalCapacity);		
	}

}
