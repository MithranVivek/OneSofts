package com.OneSoft.collections2_HashMap;

import java.util.HashMap;

public class LmsTest {

	public static void main(String[] args) {
		HashMap<Integer, String> lms = new HashMap<>();
		lms.put(570, "Nisha");
		lms.put(1131, "Vivek");
		lms.put(1130, "Dinesh");
		lms.put(1128, "sajin");
		
//		for(Integer x : lms.keySet()) {
//			System.out.println(x);
//		}
//		System.out.println();
//		for(String y : lms.values()) {
//			System.out.println(y);
//		}
//		System.out.println();
//		for(Integer z : lms.keySet()) {
//			System.out.println(z+" "+lms.get(z));
//		}
//		System.out.println();
//		
//		lms.forEach((x,y) -> System.out.println(x+" - "+y));
//		
//		System.out.println();
//		
//		lms.keySet().forEach(x->System.out.println(x));
//		
//		System.out.println();
//		
//		lms.values().forEach(y->System.out.println(y));
//		
//		System.out.println();
		
		lms.keySet().forEach(x->{
			if(x%2==0) {
				System.out.println(x+" is Even number");
			}
			else {
				System.out.println(x+" is Odd number");
			}
		});
		System.out.println();
		for(Integer z : lms.keySet()) {
			if(lms.get(z).contains("a")||lms.get(z).contains("e")||lms.get(z).contains("i")||lms.get(z).contains("o")||lms.get(z).contains("u")) {
				System.out.println(lms.get(z)+" is have a vowels");
			}
		}
		System.out.println();
		

	}

}
