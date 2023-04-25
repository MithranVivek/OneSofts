package com.OneSoft.condition;

public class Grade {
	public static void main(String[] args) {
		int grade = 0;
		if (grade>=0 && grade<=40) {
			System.out.println("C grade");
		}
		else if (grade>40 && grade<=60) {
			System.out.println("B grade");
		}
		else if (grade>60 && grade<=80) {
			System.out.println("A grade");
		}
		else if (grade>80 && grade<=100) {
			System.out.println("A+ or O grade");
		}
		else {
			System.out.println("Please Enter Valid Mark");
		}
		
	}

}
