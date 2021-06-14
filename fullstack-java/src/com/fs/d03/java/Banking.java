// Practise on class hours

package com.fs.d03.java;

public class Banking {
	private String userName;
	private String password;
	private long mobileNumber;
	final static int maxLoginAttempts = 3;
	boolean isLoginSuccess;

	public Banking(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
	
	public Banking(String userName, String password, long mobileNumber) {
		this(userName, password);
		this.mobileNumber = mobileNumber;
	}
	
	// GETTERS
	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public boolean isLoginSuccess() {
		return isLoginSuccess;
	}

	// SETTERS
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public void setLoginSuccess(boolean isLoginSuccess) {
		this.isLoginSuccess = isLoginSuccess;
	}
	
	// INSTANCE METHODS
	public boolean login(long mobileNumber) {
		boolean result = false;
		if(String.valueOf(this.mobileNumber).length() > 10) {
			System.out.println("Logging in using mobile number");
			result = true;
		} else {
			System.out.println("Logging in using mobile number failed");
			result = false;
		}
		return result;	
	}
	
	public boolean login(String userName, String password) {
		boolean result = false;
		
		System.out.println("Logging in using userName & pwd");
		return result;
	}
}
