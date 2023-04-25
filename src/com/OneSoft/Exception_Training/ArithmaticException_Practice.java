package com.OneSoft.Exception_Training;

public class ArithmaticException_Practice {

	public static void main(String[] args) {
		System.out.println("Start");
		try {
		int a = 12;
		int b = 0;
		int c = a/b;
		System.out.println(c);
		}
		catch (ArithmeticException e) {
			System.out.println("Error Occurs "+ e);
		}
		System.out.println("End");
//----------------------------------------------------
				System.out.println();
//----------------------------------------------------		
		System.out.println("Start");
		int a = 12;
		int b = 0;
		int c = a/b;
		System.out.println(c);
		System.out.println("End");

	}

}
