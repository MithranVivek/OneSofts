package com.OneSoft.condition;

public class CheckPrefix {
	
	public static void main(String[] args) {
		String word = "Butterfly";
		String start = "ly";
		
		if (word.startsWith(start)) {
			System.out.println("Word Starts With "+ start);
		}
		else {
			System.out.println("Word Not Starts With "+ start);
		}
	}

}
