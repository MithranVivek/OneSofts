package com.OneSoft.oops2_Inheritance;

public class UseMathsTeacher_MultiLevelInheritance {

	public static void main(String[] args) {
		MathsTeacher mt = new MathsTeacher();
		mt.name = "Nishanthi";
		mt.id = 234;
		mt.isMale = false;
		mt.isPrivateTeacher = true;
		mt.saleryPerDay = 800;
		mt.qualification = "Core Java";
		mt.workingHours = 9;
		System.out.println(mt.findMonthlySalary(mt.saleryPerDay));
		System.out.println(mt.name);

	}

}

class Employee {
	String name;
	int id;
	boolean isMale;
}

class Teacher extends Employee {
	boolean isPrivateTeacher;
	int saleryPerDay;
	public int findMonthlySalary(int saleryPerDay) {
		return saleryPerDay*30;
	}
}

class MathsTeacher extends Teacher {
	String qualification;
	int workingHours;
}
