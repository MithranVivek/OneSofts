package com.OnSoft.training;

public class Sample {
	
	private String name;
	private long mobileNo;
	private boolean isValid;
	
	public String getName() {
		return name;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public boolean isValid() {
		return isValid;
	}

	public Sample(String name, long mobileNo, boolean isValid) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.isValid = isValid;
	}
	

}
