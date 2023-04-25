package com.OneSoft.Exception_Training;

public class NumberFormateException_Practice {

	public static void main(String[] args) {
		System.out.println("Start");
		try {
		int a = 12;
		String b = "12a";
		int c = a+Integer.parseInt(b);
		System.out.println(c);
		}
		catch (NumberFormatException e) {
//			System.err.println("Error Occurs ");
//			System.out.println(e);
			e.printStackTrace();
		}
		finally {
			System.out.println("Enter Correct Number");
		}
		System.out.println("End");

//----------------------------------------------------
				System.out.println();
//----------------------------------------------------		
		System.out.println("Start");
		int a = 12;
		String b = "12a";
		int c = a+Integer.parseInt(b);
		System.out.println(c);
		System.out.println("End");

	}

}
