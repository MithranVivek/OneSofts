package com.OneSoft.condition;

public class CheckMaximumAge {
	public static void main(String[] args) {
		int age1 = 50;
		int age2 = 25;
		int age3 = 65;
		
		if (age1>age2 && age1>age3) {
			System.out.println(age1+" is Greater");
		}
		else if (age2>age1 && age2>age3) {
			System.out.println(age2+" is Greater");
		}
		else  {
			System.out.println(age3+" is Greater");
		}
	}

}
