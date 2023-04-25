package com.OneSoft.oops3_AbstractClass;

public abstract class Worker {
	String name;
	int id;
	int salaryParHour;
	int workingHours;
	public Worker(String name, int id) {
		this.name = name;
		this.id = id;
	}
	

	public abstract int calculateMonthlySalary(int salaryParHour, int workingHours);

	public String jobName(String name) {
		return name;
	}

}
