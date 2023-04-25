package com.OneSoft.Exception_Training;

public class CheckNameEqualse {

	public static void main(String[] args) throws NameException {
		System.out.println("Start");
		try {
		String name1 = "Nisha";
		String name2 = "Kumar";
		
		if(name1.equals(name2)) {
			System.out.println("Equalse");
		}
		else {
			throw new NameException("It is not Equals");
		}
		}
		catch (NameException ne) {
			ne.printStackTrace();
		}
		finally {
			System.out.println("Name should be same");
		}
		System.out.println("End");
		
//----------------------------------------------------
		System.out.println();
//----------------------------------------------------	
		
		System.out.println("Start");
		String name1 = "Nisha";
		String name2 = "Kumar";
		
		if(name1.equals(name2)) {
			System.out.println("Equalse");
		}
		else {
			throw new NameException("It is not Equals");
		}
		
		System.out.println("End");

	}

}
