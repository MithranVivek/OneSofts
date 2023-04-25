package com.OneSoft.oops3_AbstractClass;

public class SoftwareEngineer extends Engineer {

	@Override
	public int walk(int speed) {	
		return speed;
	}

	@Override
	public String workForLiving(String job) {
		return job;
	}

	@Override
	public String showSalary(int experience) {
		if (experience>=0 && experience<=2) {
			return "3,50,000 per annum";
		}
		else if (experience>=3 && experience<=5) {
			return "6,30,000 per annum";
		}
		else if (experience>=6 && experience<=10) {
			return "3,50,000 per annum";
		}
		else {
			return "Invalid Experience";
		}
	}
	
	

}
