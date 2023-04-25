package com.OneSoft.opps1_Encapsulation;

public class AirConditioner {
	
	private String brand;
	private int price;
	private String type;
	private Compressor compressor;
	
	public void setBrand(String b) {
		brand = b;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setPrice(int p) {
		price = p;
	}
	public int getPrice() {
		return price;
	}
	
	public void setType(String t) {
		type = t;
	}
	public String getType() {
		return type;
	}
	
	public void setCompressor(Compressor c) {
		compressor = c;
	}
	public Compressor getCompressor() {
		return compressor;
	}

}
