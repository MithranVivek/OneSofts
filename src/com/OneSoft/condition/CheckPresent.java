package com.OneSoft.condition;

public class CheckPresent {
	
	public static void main(String[] args) {
		String word = "Vivekbabu";
		String input = "babu";
		
		if (word.contains(input)) {
			System.out.println("Word Contains With "+ input);
		}
		else {
			System.out.println("Word Not Contains With "+ input);
		}
	}

}
