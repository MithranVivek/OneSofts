package com.OneSoft.opps1_Constructor;

public class UseComputer {
	
	public static void main(String[] args) {
		Cpu cpu = new Cpu("Intel",12000,16);
		Computer com = new Computer("Hp", "Elite", 42000, cpu);
		
		System.out.println(com.getBrand()+"\n"+com.getModel()+"\n"+com.getPrice()+"\n"+"\n"+com.getCpu().getBrand()+"\n"+com.getCpu().getPrice()+"\n"+com.getCpu().getRam()+"GB");
	}

}

class Computer {
	private String brand;
	private String model;
	private int price;
	private Cpu cpu;
	
	public Computer(String brand, String model, int price, Cpu cpu) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.cpu = cpu;
	}
	
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public int getPrice() {
		return price;
	}
	public Cpu getCpu() {
		return cpu;
	}
	
}

class Cpu {
	private String brand;
	private int price;
	private int ram;
	
	public Cpu(String brand,int price,int ram) {
		this.brand = brand;
		this.price = price;
		this.ram = ram;
	}
	
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public int getRam() {
		return ram;
	}
	
}
