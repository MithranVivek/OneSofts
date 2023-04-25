package com.OneSoft.function;

public class Calculator {
	public int add () {
		int a = 15;
		int b = 15;
		return a+b;
	}
	public int div() {
		int a = 15;
		int b = 5;
		return a/b;
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add());
		System.out.println(c.div());
	}

}
