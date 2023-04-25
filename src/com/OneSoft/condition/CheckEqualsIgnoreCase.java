package com.OneSoft.condition;

public class CheckEqualsIgnoreCase {
	
	public static void main(String[] args) {
		String word = "Vivekbabu";
		String input = "vivekbabu";
		
		if (word.equalsIgnoreCase(input)) {
			System.out.println("Word Equals With "+ input);
		}
		else {
			System.out.println("Word Not Equals With "+ input);
		}
	}

}
