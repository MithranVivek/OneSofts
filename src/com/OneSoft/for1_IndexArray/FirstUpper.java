package com.OneSoft.for1_IndexArray;

public class FirstUpper {
	
	public static void main(String[] args) {
		String s = "raja";
		if(s.charAt(0)=='a' || s.charAt(0)=='e' || s.charAt(0)=='i' || s.charAt(0)=='o' || s.charAt(0)=='u') {
			s = s.toUpperCase();
			System.out.println(s);
		}
		else {
			System.out.println("not vowel in first letter");
		}
	}

}
