package com.OneSoft.java8_Features;

public class UseCalculator {

	public static void main(String[] args) {
		
		Calculator add = (num1,num2)->num1+num2;
		System.out.println(add.math(12, 4));
		
		Calculator sub = (num1,num2)->num1-num2;
		System.out.println(sub.math(12, 4));
		
		Calculator mul = (num1,num2)->num1*num2;
		System.out.println(mul.math(12, 4));
		
		Calculator div = (num1,num2)->num1/num2;
		System.out.println(div.math(12, 4));
		
		System.out.println(Calculator.square(16));

	}

}
