package com.OneSoft.condition;

public class GreetingTime {
	
	public static void main(String[] args) {
		int grade = 23;
		if (grade>=0 && grade<=12) {
			System.out.println("Good Morning");
		}
		else if (grade>12 && grade<=17) {
			System.out.println("Good Afternoon");
		}
		else if (grade>17 && grade<=20) {
			System.out.println("Good Evening");
		}
		else if (grade>20 && grade<=24) {
			System.out.println("Good Night");
		}
		else {
			System.out.println("Time only Between 0-24");
		}
	}

}
