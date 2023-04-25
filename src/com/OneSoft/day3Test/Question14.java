package com.OneSoft.day3Test;

public class Question14 {

	public static void main(String[] args) {
		String a = "world wide wonder";
		String[] b = a.split(" ");
		
		System.out.println(b[0].length()+"\n"+ b[1].length()+"\n"+b[2].length());
		
		System.out.println(b[0].toUpperCase()+"\n"+b[1].toUpperCase()
								+"\n"+b[2].toUpperCase());
		
		System.out.println(a.concat(" programs"));
		
	}

}
