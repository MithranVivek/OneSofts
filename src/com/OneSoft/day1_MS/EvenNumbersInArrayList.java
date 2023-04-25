package com.OneSoft.day1_MS;

import java.util.ArrayList;

public class EvenNumbersInArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> even = new ArrayList<>();

		for (int i = 1; i < 100; i++) {
			if (i % 2 == 0) {
				even.add(i);
			}
		}

		even.forEach(x -> System.out.println(x));

	}

}
