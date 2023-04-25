package com.OneSoft.java8_Features;

import java.util.ArrayList;

public class UseEvenNO {

	public static void main(String[] args) {
		EvenNo ev = x -> {
			
			for(Integer q : x) {
				if(q%2==0) {
					System.out.println(q);
				}
			}
		};
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12); 
		list.add(21);
		list.add(32);
		list.add(44);
		list.add(57);
		list.add(69);
		list.add(77);
		list.add(86);
		list.add(98);
		
		ev.findEvenNo(list);		

	}

}
