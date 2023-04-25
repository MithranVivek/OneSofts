package com.OneSoft.opps1_Constructor;

public class UseCamera {

	public static void main(String[] args) {
		Lens l = new Lens();
		l.setType("Sperical");
		l.setLength(12);
		l.setFocus(1600);
		
		Camera c = new Camera();
		c.setBrand("Sony");
		c.setPrice(45000);
		c.setIsDigital(true);
		c.setIsWarranty(true);
		c.setLens(l);
		
		System.out.println(c);

	}

}

class Camera {
	private String brand;
	private int price;
	private boolean isDigital;
	private boolean isWarranty;
	private Lens lens;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setIsDigital(boolean isDigital) {
		this.isDigital = isDigital;
	}
	public void setIsWarranty(boolean isWarranty) {
		this.isWarranty = isWarranty;
	}
	public void setLens(Lens lens) {
		this.lens = lens;
	}
	
	public String toString() {
		
		return brand+"\n "+price+"\n  "+isDigital+"\n   "+isWarranty+"\n"
				+"\n"+lens;
	}
}

class Lens {
	private String type;
	private int length;
	private int focus;
	
	public void setType(String type) {
		this.type = type;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setFocus(int focus) {
		this.focus = focus;
	}
	
	public String toString() {
		return type+"\n "+length+"\n  "+focus;
	}
	
}
