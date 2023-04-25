package com.OneSoft.oops3_AbstractClass;

public class UseProgrammer {

	public static void main(String[] args) {
		Programmer p = new Programmer("Nishanthi", 131);
		System.out.println(p.name+" "+p.id+" "+p.jobName("java Teacher")+" "+p.calculateMonthlySalary(800, 9));

	}

}
