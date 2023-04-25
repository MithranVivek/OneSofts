package com.OneSoft.day1_MS;

import java.util.ArrayList;

public class NumbersInArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			nums.add(i);
		}

		nums.forEach(x -> System.out.println(x));

	}

}
