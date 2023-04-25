package com.OneSoft.day2Test;

public class UseEmployee40 {

	public static void main(String[] args) {
		Employee40 e = new Employee40();
		e.employeeId=2345;
		e.employeeName="vivek";
		e.dateOfBirth="09/07/1991";
		e.mobileNo=8015380379l;
		
		System.out.println("+91 "+e.mobileNo);
		System.out.println();
		
		Employee40 e1 = new Employee40();
		e1.employeeId=2345;
		e1.employeeName="vivek";
		e1.dateOfBirth="09/07/1991";
		e1.mobileNo=9845398453l;
		
		System.out.println("+91 "+e1.mobileNo);
		System.out.println();
		
		Employee40 e2 = new Employee40();
		e2.employeeId=2345;
		e2.employeeName="vivek";
		e2.dateOfBirth="09/07/1991";
		e2.mobileNo=8045380453l;
		
		System.out.println("+91 "+e2.mobileNo);
	}

}
