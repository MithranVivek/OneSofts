package com.OneSoft.for2_PrimitiveArray;

import java.util.ArrayList;
import java.util.List;

public class StringArrayReverse {
	
	public static void main(String[] args) {
		String[] words = {"sun","moon","earth"};
		String rev = "";
		List l = new ArrayList<>();
		for(int i=0;i<words.length;i++) {
			for(int j=words[i].length()-1;j>=0;j--) {
				rev = rev+words[i].charAt(j);
			}
			System.out.println(rev);
			l.add(rev);
			rev = "";
		}
		System.out.println(l);
	}

}
