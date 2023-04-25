package com.OneSoft.for3_ObjectArray;

public class UseFruit {

	public static void main(String[] args) {
		Fruit fruit1 = new Fruit();
		fruit1.name="Apple";
		fruit1.price=180;
		fruit1.isHybrid=false;
		
		Fruit fruit2 = new Fruit();
		fruit2.name="Grapes";
		fruit2.price=60;
		fruit2.isHybrid=true;

		Fruit fruit3 = new Fruit();
		fruit3.name="Strawberri";
		fruit3.price=70;
		fruit3.isHybrid=true;

		Fruit fruit4 = new Fruit();
		fruit4.name="Custerd Apple";
		fruit4.price=50;
		fruit4.isHybrid=true;

		Fruit fruit5 = new Fruit();
		fruit5.name="banana";
		fruit5.price=30;
		fruit5.isHybrid=false;
		
		Fruit[] fruits = {fruit1,fruit2,fruit3,fruit4,fruit5};
		
		for(int i=0;i<fruits.length;i++) {
			if(fruits[i].isHybrid==true) {
				System.out.println(fruits[i].name+", "+fruits[i].price+" is Hybrid");
			}
		}



	}

}
