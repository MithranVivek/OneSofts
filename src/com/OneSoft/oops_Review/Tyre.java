package com.OneSoft.oops_Review;

public class Tyre implements Vehicle {

	private int dia;
	private String buttonType;

	public Tyre(int dia, String buttonType) {
		this.dia = dia;
		this.buttonType = buttonType;
	}

	public String toString() {
		return "Button Type = "+buttonType + " Dia = "+dia+"\n";
	}

	public int getdia() {
		return dia;
	}

	public void setdia(int dia) {
		this.dia = dia;
	}

	public String getButtonType() {
		return buttonType;
	}

	public void setButtonType(String buttonType) {
		this.buttonType = buttonType;
	}

	@Override
	public String brand(String brandName) {
		
		return brandName;
	}

	@Override
	public int price(int price) {
		
		return price;
	}

}
