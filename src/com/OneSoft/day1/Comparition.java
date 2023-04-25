package com.OneSoft.day1;

public class Comparition {
	public static void main(String[] args) {
		int num1=15;
		int num2=5;
		
		boolean great=num1>num2;
		boolean less=num1<num2;
		boolean greatEqual=num1>=num2;
		boolean lessEqual=num1<=num2;
		boolean equal=num1==num2;
		boolean notEqual=num1!=num2;
		
		System.out.println("Greaterthan = "+great);
		System.out.println("Lesserthan = "+less);
		System.out.println("Greaterthan or Equal to = "+greatEqual);
		System.out.println("Lesserthan or Equal to = "+lessEqual);
		System.out.println("Equals to = "+equal);
		System.out.println("NotEquals to = "+notEqual);
	}

}
