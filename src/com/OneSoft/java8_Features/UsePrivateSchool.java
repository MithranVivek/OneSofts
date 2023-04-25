package com.OneSoft.java8_Features;

public class UsePrivateSchool {

	public static void main(String[] args) {
		PrivateSchool ps = new PrivateSchool();
		System.out.println(ps.schoolName("VidhyaMandir"));
		System.out.println(School.isPrivate(true));
		System.out.println(ps.govFees(12000));

	}

}
