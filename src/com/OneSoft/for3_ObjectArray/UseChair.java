package com.OneSoft.for3_ObjectArray;

public class UseChair {
	
	public static void main(String[] args) {
		Chair c1 = new Chair();
		c1.woodType="Metal";
		c1.price=1400;
		c1.colour="Green";
		
		Chair c2 = new Chair();
		c2.woodType="Plastic";
		c2.price=950;
		c2.colour="Sandel";
		
		Chair c3 = new Chair();
		c3.woodType="Wood";
		c3.price=1800;
		c3.colour="Brown";
		
		Chair c4 = new Chair();
		c4.woodType="Plastic";
		c4.price=400;
		c4.colour="Blue";
		
		Chair c5 = new Chair();
		c5.woodType="Metal";
		c5.price=1500;
		c5.colour="ash";
		
		Chair[] chairs = {c1,c2,c3,c4,c5};
		
		for(Chair x : chairs) {
			if(x.colour.contains("a")||x.colour.contains("e")||x.colour.contains("i")
					||x.colour.contains("o")||x.colour.contains("u")) {
				System.out.println(x.woodType+", "+x.price);
			}
		}
		
	}

}
