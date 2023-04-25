package com.OneSoft.java8_Features;

public interface Employee {
	
	public static String findsalary(int salary,int daysOfPrecent) {
		int netSalary = (salary/28)*daysOfPrecent;
		if(netSalary>23) {
		return "This Month Salary = "+netSalary+"\nGood Attendance";
		}
		else {
			return "This Month Salary = "+netSalary+"\nImprove Attendance";
		}
	}
	public String name(String name);
	public int Id(int id); 

}
