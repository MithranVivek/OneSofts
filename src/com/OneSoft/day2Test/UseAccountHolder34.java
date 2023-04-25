package com.OneSoft.day2Test;

public class UseAccountHolder34 {
	public static void main(String[] args) {
		AccountHolder34 a = new AccountHolder34();

		a.name = "mano";
		a.age = 26;
		a.gender = "Male";
		a.accountNo = 28330485612583l;
		a.monthlyIncome = 21000;
		a.savingsPercentage = 18;

		System.out.println("Savings Amount = " + (a.monthlyIncome * a.savingsPercentage / 100));

		AccountHolder34 a1 = new AccountHolder34();

		a1.name = "Savithri";
		a1.age = 25;
		a1.gender = "Female";
		a1.accountNo = 28330485612584l;
		a1.monthlyIncome = 20000;
		a1.savingsPercentage = 20;

		System.out.println("Savings Amount = " + (a1.monthlyIncome * a1.savingsPercentage / 100));
		AccountHolder34 a2 = new AccountHolder34();

		a2.name = "mano";
		a2.age = 26;
		a2.gender = "Male";
		a2.accountNo = 28330485612585l;
		a2.monthlyIncome = 30000;
		a2.savingsPercentage = 10;

		System.out.println("Savings Amount = " + (a2.monthlyIncome * a2.savingsPercentage / 100));
	}

}
