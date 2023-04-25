package com.OnSoft.training;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String a = "Body";
		String b = "Shop";
		a = a.toLowerCase();
		b = b.toLowerCase();
		if(a.length() == b.length()) {
			char[] cA1 = a.toCharArray();
			char[] cA2 = b.toCharArray();
			Arrays.sort(cA1);
			Arrays.sort(cA2);
			
			boolean res = Arrays.equals(cA1, cA2);
			if(res) {
				System.out.println(a +" and "+b+" are anagram");
			}
			else {
				System.out.println(a +" and "+b+" are not anagram");
			}
		}
		else {
			System.out.println(a +" and "+b+" are not anagram");
		}

	}

}
