package com.fs.d02.java;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String emailIdUnderTest="test@gmail.com";
		 
		 if(validateEmail(emailIdUnderTest)) {
			 System.out.println("**EMAIL VALIDATION COMPLETE** \n");
			 System.out.println("Email address entered: '" + emailIdUnderTest + "' is valid");
		 } else {
			 System.out.println("**EMAIL VALIDATION COMPLETE** \n");
			 System.out.println("Invalid email format");
		 }
	}

	public static boolean validateEmail(String inputEmailAddress) {
		int ruleNo = 0;
		ruleNo = (!inputEmailAddress.isEmpty()) ? 1 : 0 ;
		boolean isValidationSuccess = false;
		String symbolToTest = "@";
		String tempStrForTest= "";
		
		switch(ruleNo) {
			
			case(1):
				System.out.println("** Validation point 1: '@' symbol & '.' symbol should be present ** \n");

				if(inputEmailAddress.contains(symbolToTest)) {
					isValidationSuccess = true;
					System.out.println("    Validation 1 - SUCCESS \n");
				} else {
					isValidationSuccess = false;
					System.out.println("	Validation 1 FAILED! \n");
					break;
				}

			case(2):
				System.out.println("** Validation point 2: More than 1 '@' symbol should not be present ** \n");
			
				int countOfSymbolUnderTest = 0;
					for(int i = 0; i < inputEmailAddress.length(); i++) {
						if(Character.toString(inputEmailAddress.charAt(i)).contains(symbolToTest)) {
							countOfSymbolUnderTest++;
						}
					}
					if(countOfSymbolUnderTest == 1) {
						isValidationSuccess = true;
						System.out.println("    Validation 2 - SUCCESS \n");
					} else {
						isValidationSuccess = false;
						System.out.println("	Validation 2 FAILED! \n");
						break;
					}
			
			case(3):
				System.out.println("** Validation point 3: Minimum 4 characters inbetween '@' and '.' symbols ** \n");
				
				tempStrForTest = inputEmailAddress.substring(inputEmailAddress.indexOf("@") + 1, inputEmailAddress.indexOf("."));
				if(tempStrForTest.length() >= 4) {
					isValidationSuccess = true;
					System.out.println("    Validation 3 - SUCCESS \n");
				} else {
					isValidationSuccess = false;
					System.out.println("	Validation 3 FAILED! \n");
					break;
				}
			
			case(4):
				System.out.println("** Validation point 3: Minimum 3 characters before '@' symbol ** \n");

				tempStrForTest = inputEmailAddress.substring(0, inputEmailAddress.indexOf("@"));
				System.out.println(tempStrForTest);
				if(tempStrForTest.length() >= 3) {
					isValidationSuccess = true;
					System.out.println("    Validation 4 - SUCCESS \n");
				} else {
					isValidationSuccess = false;
					System.out.println("	Validation 4 FAILED! \n");
					break;
				}
				
			
			case(5):
				System.out.println("** Validation point 3: End of email should be '.com' ** \n");

				tempStrForTest = inputEmailAddress.substring(inputEmailAddress.indexOf(".")+1);
				if(tempStrForTest.equals("com")) {
					isValidationSuccess = true;
					System.out.println("    Validation 5 - SUCCESS \n");
					break;
				} else {
					isValidationSuccess = false;
					System.out.println("	Validation 5 FAILED! \n");
					break;
				}
				
			default:
				System.out.println("Email ID is NULL/EMPTY; Please enter an email address for validation");
		}
		return isValidationSuccess;
	}
}
