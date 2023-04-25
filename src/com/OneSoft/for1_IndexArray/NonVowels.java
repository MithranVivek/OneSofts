package com.OneSoft.for1_IndexArray;

public class NonVowels {
	public static void main(String[] args) {
		String w = "onesoft";
		for(int i=0;i<w.length();i++) {
			if(w.charAt(i)!='a' && w.charAt(i)!='e' && w.charAt(i)!='i' && w.charAt(i)!='o' && w.charAt(i)!='u') {
				System.out.println(w.charAt(i));
			}
			
	}
	}
	
}
