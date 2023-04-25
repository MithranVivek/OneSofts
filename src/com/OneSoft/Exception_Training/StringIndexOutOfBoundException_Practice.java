package com.OneSoft.Exception_Training;

public class StringIndexOutOfBoundException_Practice {

	public static void main(String[] args) {
		System.out.println("Start");
		try {
		String s = "OneSoft";
		System.out.println(s.charAt(9));
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("Error Occurs "+ e);
		}
		System.out.println("End");
//----------------------------------------------------
				System.out.println();
//----------------------------------------------------		
		System.out.println("Start");
		String s = "OneSoft";
		System.out.println(s.charAt(9));
		System.out.println("End");

	}

}
