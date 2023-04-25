package com.OneSoft.opps1_Encapsulation;

public class UseAirConditioner {

	public static void main(String[] args) {
		Compressor c = new Compressor();
		c.setBrand("XYZ");
		c.setPrice(7000);
		c.setCapacity(2);
		c.setPhaseType("Three");
		
		AirConditioner ac = new AirConditioner();
		ac.setBrand("Chroma");
		ac.setPrice(35000);
		ac.setType("Inverted");
		ac.setCompressor(c);
		
		System.out.println(ac.getBrand()+"\n"+ac.getPrice()+"\n");
		System.out.println(ac.getCompressor().getBrand()+"\n"+ac.getCompressor().getCapacity());

	}

}
