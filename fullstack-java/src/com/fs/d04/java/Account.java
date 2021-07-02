package com.fs.d04.java;

import java.util.Scanner;

public class Account {
	//INSTANCE VARIABLES
	private String accountNumber;
	private int balance;
	
	
	// GETTERS
	public int getBalance() {
		return balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	
	// SETTER
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	// INSTANCE METHODS
	public void deposit(int transactionAmount) {
		balance = balance + transactionAmount;
		System.out.println("**YOU HAVE COMPLETED YOUR CASH DEPOSIT**");
		System.out.println("Your balance after the transaction is: " + balance);
	}
	
	public void withdraw(int transactionAmount) {
		if(balance > transactionAmount) {
			balance = balance - transactionAmount;
			System.out.println("**YOU HAVE COMPLETED YOUR CASH WITHDRAWAL**");
			System.out.println("Your balance after the transaction is: " + balance);
		} else {
			System.out.println("**You do not have sufficient funds to perform this transaction**");
		}
	}
	
	public void performCashTransaction(int transactionNumber) {
		Scanner getTransactionAmt = new Scanner(System.in);
		switch(transactionNumber) {
			case(1): 
				System.out.println("**YOU HAVE SELECTED CASH DEPOSIT**");
				System.out.println("ENTER THE AMOUNT TO DEPOSIT: ");
				deposit(getTransactionAmt.nextInt());
				break;
				
			case(2):
				System.out.println("**YOU HAVE SELECTED CASH WITHDRAWAL**");
				System.out.println("ENTER THE AMOUNT TO WITHDRAW: ");
				withdraw(getTransactionAmt.nextInt());
				break;
		}
		getTransactionAmt.close();
	}
	
	// MAIN METHOD
	public static void main(String[] args) {
		Scanner getUserDetails = new Scanner(System.in);
		Account user1 = new Account();
		System.out.println("Enter the Account Number: ");
		user1.setAccountNumber(getUserDetails.nextLine());
		System.out.println("Enter the Account Balance: ");
		user1.balance = getUserDetails.nextInt();
		System.out.println("Enter 1 to deposit an amount, 2 to withdraw");
		user1.performCashTransaction(getUserDetails.nextInt());
		getUserDetails.close();
	}
}