package com.OneSoft.java8_Features;

@FunctionalInterface
public interface Calculator {
	
	public int math(int a, int b); 
	public static String square(int num) {
		 int div = 0 , a =0;
		 boolean square = false;
		for(int i=1;i<num;i++) {
			div = num/i;
			a=i;
			if(div==i) {
				square = true;
			}
		}
			if(square==true) {
				return "Square";
			}
			else {
				return "Not Square";
			}
		
	}

}
