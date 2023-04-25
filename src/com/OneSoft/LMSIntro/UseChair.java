package com.OneSoft.LMSIntro;

public class UseChair {
	public static void main(String[] args) {
		Chair c = new Chair();
		c.price=Integer.parseInt(args[0]);
		c.material=args[1];
		c.discount=Integer.parseInt(args[2]);
		c.brand=args[3];
		c.netPrice=c.price-c.discount;
		
		System.out.println("Price= "+c.price+", Material= "+c.material+", Net Price= "+c.netPrice);
	}

}
