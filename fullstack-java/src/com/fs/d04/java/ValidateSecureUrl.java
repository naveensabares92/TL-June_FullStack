package com.fs.d04.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidateSecureUrl {
	public static void main(String[] args) {
		
		String webAddressInput = "";
		String securedProtocol = "https";
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	      
		System.out.println("*****CHECK IF EMAIL IS SECURED*****\n");
		System.out.println("Enter an email address: ");
		try {
			webAddressInput = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Enter an email address");
		}
		String actualProtocol = webAddressInput.substring(0, webAddressInput.indexOf(':'));

		if(actualProtocol.equals(securedProtocol)) {
			System.out.println(webAddressInput + " starts with " + securedProtocol + "; Webaddress SECURED");
		} else if(!actualProtocol.equals(securedProtocol)){
			System.out.println(webAddressInput + " starts with http; Webaddress NOT SECURED");	
		}
	}
}
