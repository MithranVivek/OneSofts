package com.OneSoft.java8_Features;

public interface School {
	
	public String schoolName(String name);
	
	public static String isPrivate(boolean isPrivate) {
		if(isPrivate==true) {
		return "Private";
		}
		else {
			return "Gov";
			
		}
	}
	
	public default int govFees(int fees) {
		return fees;
	}

}
