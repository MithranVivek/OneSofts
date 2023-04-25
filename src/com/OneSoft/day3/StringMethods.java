package com.OneSoft.day3;

public class StringMethods {

	public static void main(String[] args) {
		
		String value = "One Soft Technologies";
		
//		UpperCase Method:
		String upper = value.toUpperCase();
		System.out.println(upper);
		System.out.println(value.toUpperCase()+"\n");
		
//		LowerCase Method:
		String lower = value.toLowerCase();
		System.out.println(lower);
		
//		Length Method:
		int length = value.length();
		System.out.println(length+"\n");
		
//		Contains Method:
		boolean contains = value.contains("Soft");
		System.out.println(contains+"\n");
		
//		SubString Method:
		String subString = value.substring(5);
		String subString1 = value.substring(5, 7);
		System.out.println(subString+"\n"+subString1+"\n");
		
//		StartsWith Method:
		boolean startsWith = value.startsWith("O");
		System.out.println(startsWith+"\n");
		
//		EndsWith Method:
		boolean endsWith = value.endsWith("es");
		System.out.println(endsWith+"\n");
		
//		Concat Method:
		String value3 = " Development";
		String concat = value.concat(value3);
		System.out.println(concat+"\n");
		
//		Equals Method:
		boolean equals = value.equals(value3);
		System.out.println(equals+"\n");
		
//		EqualsIgnoreCase Method:
		boolean equalsIgC = value.equals(value3);
		System.out.println(equalsIgC+"\n");
		
//		IndexOf Method:
		int index = value.indexOf("o");
		System.out.println(index+"\n");
		
//		LastIndexOf Method:
		int lastIndexOf = value.lastIndexOf("o");
		System.out.println(lastIndexOf);
		
//		charAt Method:
		char ch = value.charAt(4);
		System.out.println(ch+"\n");
		
//		toCharArray Method:
		char[] charArray = value.toCharArray();
		System.out.println(charArray[5]+"\n");
		
//		Split Method:
		String[] split = value.split("e");
		System.out.println(split.length);
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		System.out.println(split[3]);
		
		
//		String value1 = "SOFTWARE";
//		System.out.println(value1.toLowerCase()+"\n");
		
//		String s = "Copper";
//		System.out.println(s.toUpperCase());
//		System.out.println(s.toLowerCase());
//		System.out.println(s.length());
//		System.out.println(s.contains("e"));
//		System.out.println(s.startsWith("oc"));
//		System.out.println(s.endsWith("er"));

	}

}
