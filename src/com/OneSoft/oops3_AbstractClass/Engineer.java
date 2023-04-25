package com.OneSoft.oops3_AbstractClass;

public abstract class Engineer implements Human {
	
	@Override
	public String eat(String food) {
		return food;
	}
	
	@Override
	public int sleep(int hour) {
		return hour;
	}
	
	public abstract String workForLiving(String job);
	
	public abstract String showSalary(int experience);

}
