package com.fs.d04.java;

import java.util.Scanner;

public class ShapeClient {
	
	public static void main(String[] args) {
		System.out.println("**Calculate Area of Shape**");
		System.out.println("Choose any of the below shape");
		System.out.println("1. Rectangle \n2. Square\n3. Circle\n4. Hexagon");

		Scanner input = new Scanner(System.in);
		int choiceOfShape = input.nextInt();
		Shape shape;
		switch (choiceOfShape) {
		case 1:
			System.out.println("You have chosen Shape- Rectangle \nPlease enter length & breath");
			shape = new ShapeRectangle(input.nextInt(), input.nextInt());
			System.out.println("Area of Rectangle is: " + shape.calculateArea());
			break;
		case 2:
			System.out.println("You have chosen Shape- Square \nPlease enter side");
			shape = new ShapeSquare(input.nextInt());
			System.out.println("Area of Square is: " + shape.calculateArea());			
			break;
		case 3:
			System.out.println("You have chosen Shape- Circle \nPlease enter radius");
			shape = new ShapeCircle(input.nextInt());
			System.out.println("Area of Circle is: " + shape.calculateArea());
			break;
		case 4:
			System.out.println("You have chosen Shape- Hexagon \nPlease enter side");
			shape = new ShapeHexagon(input.nextInt());
			System.out.println("Area of Hexagon is: " + shape.calculateArea());
			break;

		default:
			System.out.println("Enter a valid input! ");
			break;
		}
		input.close();
	}
}
