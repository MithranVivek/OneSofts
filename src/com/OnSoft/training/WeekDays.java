package com.OnSoft.training;

public class WeekDays {
	
	public static void main(String[] args) {
		String[] days = {"SUN","MON","TUE","WED","THURS","FRI","SAT"};
		int day = 6, count=0;
		
		while(day>=0) {
			if(days[day].startsWith("S")) {
				System.out.println("WEEKEND");
			}
			else {
				System.out.println("WEEKDAY");
				count = count+1;
			}
			day--;
		}
		
		System.out.println(count);
		 
	}

}
