package com.OneSoft.Exception_Training;

public class NullPointerException_Practice {

	public static void main(String[] args) {
		System.out.println("Start");
		try {
		String s = null;
		int ch = s.length();
		System.out.println(ch);
		}
		catch (NullPointerException e) {
			System.out.println("Error Occurs "+ e);
		}
		System.out.println("End");
//----------------------------------------------------
				System.out.println();
//----------------------------------------------------		
		System.out.println("Start");
		String s = null;
		int ch = s.length();
		System.out.println(ch);
		System.out.println("End");

	}

}
