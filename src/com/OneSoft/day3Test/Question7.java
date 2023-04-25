package com.OneSoft.day3Test;

public class Question7 {

	public static void main(String[] args) {
		String a = "Java,PYTHON,CH+";
		String[] b = a.split(",");

		System.out.println(b[0].length() + "\n" + b[1].length() + "\n" 
							+ b[2].length());
		System.out.println(b[0].toLowerCase() + "\n" + b[1].toLowerCase() + "\n" 
							+ b[2].toLowerCase());

	}

}
