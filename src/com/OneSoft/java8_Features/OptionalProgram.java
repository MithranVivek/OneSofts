package com.OneSoft.java8_Features;

import java.util.Optional;

public class OptionalProgram {

	public static void main(String[] args) {
		String s = null;
		String s1 = "vivek";
		
//		System.out.println(s.length());
		
		Optional<String> z = Optional.ofNullable(s);
		
		if(z.isPresent()) {
			System.out.println(s.toUpperCase());
		}
		else {
			System.out.println("Value not present");
		}
//------------------------------------------------------------------------	
		System.out.println(z.orElse("value not present"));
//------------------------------------------------------------------------	
		if(z.isEmpty()) {
			System.out.println("Value not present");
		}
		else {
			System.out.println(s.toUpperCase());
		}
//------------------------------------------------------------------------
		Optional<String> z1 = Optional.of(s1);
		
		System.out.println(z1.isPresent());
		System.out.println(z1.isEmpty());

	}

}
