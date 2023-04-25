package com.OneSoft.oops3_AbstractClass;

public class Programmer extends Worker{

	public Programmer(String name, int id) {
		super(name, id);
	}

	@Override
	public int calculateMonthlySalary(int salaryParHour, int workingHours) {
		
		return (workingHours*30)*salaryParHour;
	}
	

}
