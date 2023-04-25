package com.OneSoft.Exception_Training;

public class Login {
	
	
	public void CheckPassword(String password)  {
		try {
		if(password.length()<8) {
			throw new PasswordException("Password must contain above 8 Characters");
		}
		else {
			System.out.println( "Login Successfully");
		}
		}
		catch (PasswordException e) {
			e.printStackTrace();
		}
	}
	
}
