package com.OneSoft.opps1_Constructor;

public class UseLaptop {

	public static void main(String[] args) {
		Display d = new Display("LED", 14);
		Laptop l = new Laptop("Hp", 42000, d);
		l.setBrand("Lenova");
		
		System.out.println(l);
		System.out.println(l.getBrand()+", "+l.getPrice()+", "+l.getDisplay());
		

	}

}

class Laptop {
	private String brand;
	private int price;
	private Display display;
	
	public Laptop(String brand,int price,Display display) {
		this.brand = brand;
		this.price = price;
		this.display = display;
	}
	public String toString() {
		return brand+" "+price+" "+display;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDisplay(Display display) {
		this.display = display;
	}
	
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public Display getDisplay() {
		return display;
	}
	
}

class Display {
	private String type;
	private int size;
	public Display(String type,int size) {
		this.type = type;
		this.size = size;
	}
	public String toString() {
		return "\n"+type+" "+size;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public int getSize() {
		return size;
	}
	
	
}
