package com.OneSoft.day3Test;

public class UseHospital13 {

	public static void main(String[] args) {
		Hospital13 hos1 = new Hospital13();
		Hospital13 hos2 = new Hospital13();
		Hospital13 hos3 = new Hospital13();
		
		hos1.name="apollo";
		hos2.name="kauvery";
		hos3.name="sims";
		
		hos1.location="CHENNAI";
		hos2.location="CHENNAI";
		hos3.location="CHENNAI";
		
		hos1.isAvail24=true;
		hos2.isAvail24=true;
		hos3.isAvail24=true;
		
		System.out.println(hos1.name.toUpperCase()+"\n"+hos2.name.toUpperCase()
							+"\n"+hos3.name.toUpperCase());
		
		System.out.println("Length of location is "+hos1.location.length());
		
		System.out.println(hos1.name.equals(hos3.name));
		
	}

}
