package com.OneSoft.java8_Features;

import java.util.Scanner;

public class ScannerProgram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Name : ");
		String name = s.nextLine();
		System.out.println("Enter your Age : ");
		int age = s.nextInt();
		System.out.println("You are Male : ");
		boolean isMale = s.nextBoolean();
		System.out.println("Enter your E-mail ID : ");
		String eMail = s.next();
		System.out.println("Enter your Address : ");
		String address = s.next();

		System.out.println("Enter your Phone No : ");
		long phNo = s.nextLong();
		System.out.println("Enter your Weight : ");
		double weight = s.nextDouble();
		System.out.println("Enter your Hight : ");
		float height = s.nextFloat();

		System.out.println("Name - " + name + "\nAge - " + age +"\nAre You Male - "+isMale+ " \nE-mail ID - " + eMail + "\nAddress - " + address
				+ "\nPhone No - " + phNo + "\nWeight - " + weight + "\nHeight - " + height);
	}

}
