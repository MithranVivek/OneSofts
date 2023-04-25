package com.OneSoft.day3;

public class ArrayConcept {
	public static void main(String[] args) {
		
		int num[] = {10,20,30,40,50};
		System.out.println(num[0]);
		System.out.println(num[4]);
		
		String name[] = {"Prakash","mani","sudharsan","surya"};
		System.out.println(name[0]==name[0]);
		System.out.println(name[0].concat(name[3]));
		System.out.println(name[2].length());
		
		float ring[] = {10.5f,7.5f,7.0f,8.2f};
		System.out.println(ring[0]+ring[2]);
		System.out.println(ring[3]-ring[2]);
		System.out.println(ring[1]*ring[2]);
		
		boolean isCircle[] = {true,false,false,true,true};
		System.out.println(isCircle[4]);
		System.out.println(isCircle[2]);
		System.out.println(isCircle[0]+" "+isCircle[2]);
		
		System.out.println(name[3].toCharArray());
		
	}

}
