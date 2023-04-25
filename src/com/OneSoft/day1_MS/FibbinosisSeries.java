package com.OneSoft.day1_MS;

public class FibbinosisSeries {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 0; i < 8; i++) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}

	}

}
