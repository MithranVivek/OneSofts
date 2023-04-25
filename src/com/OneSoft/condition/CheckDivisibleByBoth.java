package com.OneSoft.condition;

public class CheckDivisibleByBoth {

	public static void main(String[] args) {
		int num = 50;
		if (num%3==0 && num%5==0) {
			System.out.println("Divisible");
		}
		else {
			System.out.println("Not a Divisible");
		}
	}

}
