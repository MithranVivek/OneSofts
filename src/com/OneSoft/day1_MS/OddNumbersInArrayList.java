package com.OneSoft.day1_MS;

import java.util.ArrayList;

public class OddNumbersInArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> odd = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			if (i % 2 != 0) {
				odd.add(i);
			}
		}

		odd.forEach(x -> System.out.println(x));

	}

}
