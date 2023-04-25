package com.OneSoft.condition;

public class CheckSuffix {
	
	public static void main(String[] args) {
		String word = "Butterfly";
		String end ="ly";
		
		if (word.endsWith(end)) {
			System.out.println("Word Ends With "+ end);
		}
		else {
			System.out.println("Word Not Ends With "+ end);
		}
	}

}
