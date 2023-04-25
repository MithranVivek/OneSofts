package com.OneSoft.opps1_Encapsulation;

public class Battery {
	private String modelNo;
	private int mAH;
	private boolean isLithium;
	
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public String getModelNo() {
		return modelNo;
	}
	
	public void setMAH(int mAH) {
		this.mAH = mAH;
	}
	public int getMAH() {
		return mAH;
	}
	
	public void setIsLithium(boolean  isLithium) {
		this.isLithium = isLithium;
	}
	public boolean getIsLithium() {
		return isLithium;
	}

}
