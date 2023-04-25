package com.OneSoft.day2Test;

public class UseStudent39 {

	public static void main(String[] args) {
		Student39 s = new Student39();

		s.studentName = "Rajesh";
		s.studentAge = 16;
		s.studentMobileNo = 9897969594l;
		s.classSection = "XI-C";
		s.markPercentage = 70;

		System.out.println(s.studentName + "\n" + s.studentAge + "\n" + s.studentMobileNo + "\n" + s.classSection + "\n"
				+ s.markPercentage + "\n");

		Student39 s1 = new Student39();

		s1.studentName = "Ramesh";
		s1.studentAge = 15;
		s1.studentMobileNo = 9895949796l;
		s1.classSection = "XI-A";
		s1.markPercentage = 82;

		System.out.println(s1.studentName + "\n" + s1.studentAge + "\n" + s1.studentMobileNo + "\n" + s1.classSection
				+ "\n" + s1.markPercentage + "\n");

		Student39 s2 = new Student39();

		s2.studentName = "Kamesh";
		s2.studentAge = 16;
		s2.studentMobileNo = 8097969594l;
		s2.classSection = "X-B";
		s2.markPercentage = 65;

		System.out.println(s2.studentName + "\n" + s2.studentAge + "\n" + s2.studentMobileNo + "\n" + s2.classSection
				+ "\n" + s2.markPercentage);
	}

}
