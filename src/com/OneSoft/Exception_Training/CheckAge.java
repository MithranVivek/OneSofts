package com.OneSoft.Exception_Training;

public class CheckAge {

	public static void main(String[] args) throws AgeException{
		System.out.println("Start");
		try {
		int age = 10;
		if (age<18) {
			throw new AgeException("NOT ELIGIBLE - Age Below 18");
		} else {
			System.out.println("ELIGIBLE");
		}
		}
		catch (AgeException e) {
			e.printStackTrace();
		}
		System.out.println("End");
		
//----------------------------------------------------
				System.out.println();
//----------------------------------------------------	
				
		System.out.println("Start");
		int age = 10;
		if (age<18) {
			throw new AgeException("NOT ELIGIBLE - Age Below 18");
		} else {
			System.out.println("ELIGIBLE");
		}
		System.out.println("End");


	}

}
