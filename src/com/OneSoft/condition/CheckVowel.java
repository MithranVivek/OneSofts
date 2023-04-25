package com.OneSoft.condition;

public class CheckVowel {
	
	public static void main(String[] args) {
		String word = "dog";
		if(word.contains("a")||word.contains("e")||word.contains("i")||word.contains("o")||word.contains("u")) {
			System.out.println("It's a Vowel Word");
		}
		else {
			System.out.println("It's Not a Vowel Word");
		}
	}

}
