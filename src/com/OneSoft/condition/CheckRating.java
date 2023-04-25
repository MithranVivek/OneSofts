package com.OneSoft.condition;

public class CheckRating {

	public static void main(String[] args) {
		int rating = 5;

		if (rating == 5) {
			System.out.println("Excellent");
		} else if (rating == 4) {
			System.out.println("Good");
		} else if (rating == 3) {
			System.out.println("Average");
		} else if (rating == 2) {
			System.out.println("Poor");
		} else if (rating == 1) {
			System.out.println("Bad");
		} else {
			System.out.println("In-Valid");
		}

	}

}
