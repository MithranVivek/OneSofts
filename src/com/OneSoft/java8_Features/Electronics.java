package com.OneSoft.java8_Features;

public interface Electronics {
	
	public int reSale(int price);
	public default String onOff(boolean isOn) {
		if(isOn==true) {
		return "Product is Working";
		}
		else {
			return "Product is Not Working";
		}
	}

}
