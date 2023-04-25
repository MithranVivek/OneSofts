package com.OneSoft.Exception_Training;

public class ArrayIndexOutOfBoundException_Practice {

	public static void main(String[] args) {
		System.out.println("Start");
		try {
		int[] num = {12,23,34,56,45,67};
		System.out.println(num[8]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error Occurs "+ e);
		}
		System.out.println("End");
//----------------------------------------------------
				System.out.println();
//----------------------------------------------------		
		System.out.println("Start");
		int[] num = {12,23,34,56,45,67};
		System.out.println(num[8]);
		System.out.println("End");

	}

}
