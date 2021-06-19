package com.fs.d04.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trainee {
	// STATIC VARIABLES 
	static String BATCH_CODE = "CHNFSD";
	
	
	// INSTANCE VARIABLES
	private int employeeId;
	private String name;
	
	// CONSTRUCTORS
	public Trainee() {
		
	}
	
	public Trainee(int employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}

	// GETTERS
	public int getEmployeeId(int employeeNumber) {
		return employeeId;
	}

	public String getName(int employeeNumber) {
		return name;
	}
	
	// SETTERS
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// INSTANCE METHODS
	void display() {
		System.out.println("Employee ID: " + this.employeeId
				+ "\nName: " + this.name
				+"\nBatch Code: " + BATCH_CODE);
	}
	
	// MAIN METHOD
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    
		System.out.println(" Enter the number of trainees: ");
		int numberOfTrainees = Integer.parseInt(reader.readLine());
		
		Trainee traineeDetails = new Trainee();
		
		for(int i=0; i<numberOfTrainees; i++) {
			System.out.println("Enter Employee " + (i+1) + " Details: ");
			System.out.println("Enter Employee " + (i+1) + " ID: \n");
			traineeDetails.setEmployeeId(Integer.parseInt(reader.readLine()));
			System.out.println("Enter Employee Name: ");
			traineeDetails.setName((reader.readLine()));
			
			traineeDetails.display();	
		}
	}
	

}
