package com.OneSoft.collections1_ArrayList;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
////add method
		nums.add(5);
		nums.add(7);
		nums.add(8);
		nums.add(9);
////get mothod
		//System.out.println(nums.get(1));
//// set method
		nums.set(1, 6);

//		System.out.println(nums);
//
//		nums.add(2, 7);
//
//		System.out.println(nums);
////remove method
//		nums.remove(2);
//
//		System.out.println(nums);
//
//		System.out.println(nums.size());
//
//		for (Integer x : nums) {
//			System.out.println(x);
//		}
//
//		for (int i = 0; i < nums.size(); i++) {
//			System.out.println(nums.get(i));
//		}
//		
//		nums.forEach(x->System.out.println(x));
		
		nums.forEach(x->{
			if(x%2==0) {
				System.out.println(x);
			}
		});
		
		for (int i = 0; i < nums.size(); i++) {
			if(nums.get(i)%2!=0) {
				System.out.println(nums.get(i));
			}
		}

	}

}
