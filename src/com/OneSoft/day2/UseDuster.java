package com.OneSoft.day2;

public class UseDuster {

	public static void main(String[] args) {
		Duster d = new Duster();
		d.shape="Rectangle";
		d.material="wood";
		d.colour="Brown";
		d.isBlackBoard=true;
		d.price=120;
		
		System.out.println(d.shape+" "+d.material+" "+d.colour+" "+d.isBlackBoard+" "+d.price);
		
		

	}

}
