package com.OneSoft.for1_IndexArray;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		int a = 0 , b = 1 , c = 0;
		
		for(int i=0;i<10;i++) {
			System.out.println(a);
			a=b;
			b=a+c;
			c=a;
		}
		
	}

}
