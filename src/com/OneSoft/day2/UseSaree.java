package com.OneSoft.day2;

public class UseSaree {
	public static void main(String[] args) {
		Saree s = new Saree();
		s.Matterial = "Cotton";
		s.price = 2999;
		s.discount = 400;
		s.colour = "Green";
		s.offer = 15;
		s.offerPrice = s.price - s.offer;
		s.netPrice = (s.price - (s.price * s.offer) / 100);

		System.out.println("Saree Matterial - " + s.Matterial + "\n" + "Saree Colour - " + s.colour + "\n" + "Price - "
				+ s.netPrice + "\n" + "Total Discount - " + s.discount + "\n");
	}

}
