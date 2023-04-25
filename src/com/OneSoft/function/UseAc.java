package com.OneSoft.function;

public class UseAc {

	public static void main(String[] args) {
		Ac ac1 = new Ac();
		ac1.brand="Whirlpool";
		ac1.price=24000;
		ac1.tone=1.5f;
		
		Ac ac2 = new Ac();
		ac2.brand="Samsung";
		ac2.price=32000;
		ac2.tone=2.0f;
		
		Ac ac3 = new Ac();
		ac3.brand="Onida";
		ac3.price=21000;
		ac3.tone=1.0f;
		
		Ac ac4 = new Ac();
		ac4.brand="LG";
		ac4.price=29000;
		ac4.tone=1.5f;
		
		Ac ac5 = new Ac();
		ac5.brand="Croma";
		ac5.price=27000;
		ac5.tone=2.0f;
		
		Ac[] acs = {ac1,ac2,ac3,ac4,ac5};
		
		int max = acs[0].price; Ac temp = null;
		for(int i=0;i<acs.length;i++) {
			if(max<=acs[i].price) {
				max=acs[i].price+acs[i].price*10/100;
				temp = acs[i];
			}
			
		}
		System.out.println(temp.brand+", "+temp.price+", "+temp.tone+"Tone");
		System.out.println("Tax added price = "+max);
		
		ac3.findMaxPrice(acs);
	}

}
