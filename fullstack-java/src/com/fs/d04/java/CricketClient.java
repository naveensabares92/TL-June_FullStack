package com.fs.d04.java;

import java.util.Scanner;

public class CricketClient {
	public static void main(String[] args) {
		String bowler, batsman;
		long runs;
		int choice;
		System.out.println("1. Player details of the delivery");
		System.out.println("2. Run details of the delivery");
		CricketCommentary delivery = new CricketCommentary();
		Scanner input = new Scanner(System.in);
		choice = input.nextInt();
		switch (choice) {
		case 1:
			bowler = input.nextLine();
			System.out.println("Enter Bowler Name : ");
			bowler = input.nextLine();
			System.out.println("Enter Bastman name : ");
			batsman = input.nextLine();
			delivery.displayDeliveryDetails(bowler, batsman);
			break;
		case 2:
			System.out.println("Enter the number of runs : ");
			runs = input.nextLong();
			delivery.displayDeliveryDetails(runs);
			break;
		default:
			System.out.println("Enter Valid input !!");
		}
		input.close();
	}
}
