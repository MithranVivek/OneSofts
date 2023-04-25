package com.OneSoft.day2Test;

public class UseStudent33 {
	public static void main(String[] args) {

		int totalWorkingDays = 240;

		Student33 s = new Student33();

		s.name = "siva";
		s.id = 234;
		s.age = 14;
		s.classs = "IX";
		s.attendancePercentage = 75;
		s.noOfDayPrecentInSchool = (totalWorkingDays * s.attendancePercentage / 100);
		System.out.println(s.noOfDayPrecentInSchool);

		Student33 s1 = new Student33();

		s1.name = "mari";
		s1.id = 236;
		s1.age = 15;
		s1.classs = "X";
		s1.attendancePercentage = 80;
		s1.noOfDayPrecentInSchool = (totalWorkingDays * s1.attendancePercentage / 100);
		System.out.println(s1.noOfDayPrecentInSchool);

		Student33 s2 = new Student33();

		s2.name = "Valli";
		s2.id = 237;
		s2.age = 13;
		s2.classs = "VII";
		s2.attendancePercentage = 100;
		s2.noOfDayPrecentInSchool = (totalWorkingDays * s2.attendancePercentage / 100);
		System.out.println(s2.noOfDayPrecentInSchool);
	}

}
