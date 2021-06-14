// Practise on class hours

package com.fs.d03.java;


public class BankingLogin {
	
	// MAIN
	public static void main(String[] args) {
		Banking name = new Banking("name", "password", 12566);
		System.out.println(name.login(name.getMobileNumber()));
	}
	
	

}
