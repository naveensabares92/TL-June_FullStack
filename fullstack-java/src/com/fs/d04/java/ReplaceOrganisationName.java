package com.fs.d04.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReplaceOrganisationName {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the content of the document: \n");
		String legalDocument = reader.readLine();
	
		System.out.println("Enter the old company name: \n");
		String oldCompanyName = reader.readLine();
		
		System.out.println("Enter the new company name: \n");
		String newCompanyName = reader.readLine();
		
		System.out.println("The content of the modified document is:\n" 
				+ legalDocument.replace(oldCompanyName, newCompanyName));
	}
	
}
