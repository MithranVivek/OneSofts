package com.OneSoft.for3_ObjectArray;

public class UseSim {

	public static void main(String[] args) {
		Sim sim1 = new Sim();
		sim1.simNumber=8015380379l;
		sim1.holderName="Vivekbabu";
		sim1.Price=260;
		
		Sim sim2 = new Sim();
		sim2.simNumber=8015380379l;
		sim2.holderName="Dinesh";
		sim2.Price=200;
		
		Sim sim3 = new Sim();
		sim3.simNumber=8015380379l;
		sim3.holderName="Sajin";
		sim3.Price=210;
		
		Sim sim4 = new Sim();
		sim4.simNumber=8015380379l;
		sim4.holderName="Ramesh";
		sim4.Price=230;
		
		Sim sim5 = new Sim();
		sim5.simNumber=8015380379l;
		sim5.holderName="Rajesh";
		sim5.Price=180;
		
		Sim[] sims = {sim1,sim2,sim3,sim4,sim5};
		
		Sim nMin = null; int pMin = sims[0].Price;
		
		for(int i=0;i<sims.length;i++) {
			if(sims[i].Price<=pMin) {
				pMin = sims[i].Price;
				nMin = sims[i];
			}
		}
		System.out.println("Name : "+nMin.holderName);

	}

}
