package com.OneSoft.opps1_Encapsulation;

public class UseMobile {
	
	public static void main(String[] args) {
		Battery b = new Battery();
		b.setModelNo("LI12345N3456");
		b.setMAH(6000);
		b.setIsLithium(false);
		
		Mobile m = new Mobile();
		m.setBrand("Realmi");
		m.setModel("8s 5G");
		m.setColor("Blue");
		m.setIsAndroid(true);
		m.setPrice(18000);
		m.setBattery(b);
		
		System.out.println(m.getBrand()+"\n"+m.getModel()+"\n"+m.getPrice()+"\n"+m.getColor()+"\n"+m.getIsAndroid()+"\n");
		System.out.println(m.getBattery().getModelNo()+"\n"+m.getBattery().getMAH()+"\n"+m.getBattery().getIsLithium());
	}

}
