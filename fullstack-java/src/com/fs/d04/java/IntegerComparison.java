package com.fs.d04.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerComparison {
	private int number1;
	private int number2;

	// GETTERS
	public int getNumber1() {
		return number1;
	}

	public int getNumber2() {
		return number2;
	}

	// SETTERS
	public void setNumber1(int number1) {
		if(number1 >= 0)
			this.number1 = number1;
	}

	public void setNumber2(int number2) {
		if(number2 >= 0)
			this.number2 = number2;
	}


	public static void main(String[] args) {
		IntegerComparison obj = new  IntegerComparison();

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        
        try {
			System.out.println("Enter number 1: ");
			obj.setNumber1(Integer.parseInt(reader.readLine()));
			
			System.out.println("Enter number 2: ");
			obj.setNumber2(Integer.parseInt(reader.readLine()));
		} catch (IOException e) {
			e.printStackTrace();
		} catch(NumberFormatException e) {
			System.out.println("Please enter the lab capacity in natural numbers only");
		}
        
        if(obj.getNumber1() > obj.getNumber2()) {
        	System.out.println(obj.getNumber1() + " is greater than " +  obj.number2);
        } else if(obj.getNumber1() < obj.getNumber2()) {
        	System.out.println(obj.getNumber1() + " is lesser than " +  obj.number2);
        } else {
        	System.out.println(obj.getNumber1() + " is equal to " +  obj.number2);
        }
        
	}
	

}
