package com.OneSoft.oops2_Inheritance;

public class UseEngineer_SingleInheritance {

	public static void main(String[] args) {
		SoftwareEngineer s = new SoftwareEngineer();
		s.name = "Madha";
		s.department = "developer";
		s.field = "Offsite";
		s.salery = 45000;
		System.out.println(s.name+" "+s.department+" "+s.field+" "+s.salery+"\n"+s.workType(true));

	}

}

class Engineer {
	String department;
	String field;
	public String workType(boolean isWFH) {
		return "work from Office";
	}
}

class SoftwareEngineer extends Engineer {
	String name;
	int salery;
	public String workType(boolean isWFH) {
		return "work from Home";
	}
}