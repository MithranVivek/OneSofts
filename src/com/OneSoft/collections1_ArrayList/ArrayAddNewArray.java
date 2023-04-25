package com.OneSoft.collections1_ArrayList;

import java.util.ArrayList;

public class ArrayAddNewArray {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
			nums.add(5);
			nums.add(6);
			nums.add(7);
			nums.add(8);
			nums.add(9);
		ArrayList<Integer> evenNums = new ArrayList<>();
		for(int i=0;i<nums.size();i++) {
			if(nums.get(i)%2==0) {
			evenNums.add(nums.get(i));
			}
		}
		System.out.println(evenNums);

	}
}
