package com.OneSoft.java8_Features;

public class Mobile implements Electronics{

	@Override
	public int reSale(int price) {
		return price;
	}
	@Override
	public String onOff(boolean isOn) {
		if(isOn==false) {
			return "Product is Working";
			}
			else {
				return "Product is Not Working";
			}
	}
	
	

}
