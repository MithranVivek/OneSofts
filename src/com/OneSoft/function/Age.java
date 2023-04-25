package com.OneSoft.function;

public class Age {

	public String findVoterAge(int age) {
		if (age > 18) {
			return "Eligible";
		} else {
			return "NOt Eligible";
		}
	}

	public void maxAge() {
		int age1 = 20;
		int age2 = 30;
		int age3 = 23;
		if (age1 > age2 && age1 > age3) {
			System.out.println("Age1 is grater");
		} else if (age2 > age1 && age2 > age3) {
			System.out.println("Age2 is grater");
		} else {
			System.out.println("Age3 is grater");
		}
	}

	public void switchDay(int day) {
		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Enter valid number");
			break;
		}
	}

	public static void main(String[] args) {
		Age a = new Age();
		System.out.println(a.findVoterAge(23));
		a.maxAge();
		a.switchDay(6);
	}

}
