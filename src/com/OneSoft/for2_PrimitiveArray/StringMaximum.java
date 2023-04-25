package com.OneSoft.for2_PrimitiveArray;

public class StringMaximum {
	
	public static void main(String[] args) {
		String[] words = {"sun","moon","earth"};
		String temp = words[0];
		for(int i=0;i<words.length;i++) {
			if(words[i].length()>=temp.length()) {
				temp = words[i];
			}
		}
		System.out.println(temp);
	}

}
