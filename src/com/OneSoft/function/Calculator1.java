package com.OneSoft.function;

public class Calculator1 {
	
	int sub(int a, int b) {
		return a-b;
	}
	int mul(int a, int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		Calculator1 c = new Calculator1();
		System.out.println(c.sub(15, 5));
		System.out.println(c.mul(15, 5));
		int mul = c.mul(10, 20);
		System.out.println(mul);
	}

}
