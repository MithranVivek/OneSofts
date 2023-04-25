package com.OneSoft.for1_IndexArray;

public class LastVowel {
	
	public static void main(String[] args) {
		String s = "raja";
		if(s.charAt(0)=='a' || s.charAt(0)=='e' || s.charAt(0)=='i' || s.charAt(0)=='o' || s.charAt(0)=='u') {
			System.out.println("not vowel in last letter");
		}
		else {
			s = s.toUpperCase();
			System.out.println(s);
			
		}
	}

}
