package com.OneSoft.functionInterface_Homework;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UseType2_ConsumerInterface {

	public static void main(String[] args) {
		Consumer<String> greatings = (name)-> {
			System.out.println("Hi "+name+", \n     I am vivekbabu from chengalpattu.");
		};
		
		greatings.accept("Ramesh");
		greatings.accept("James");
		greatings.accept("Bala");
		greatings.accept("Kanagavel");
		greatings.accept("Saravanan");
		
		Consumer<Integer> netPrice = (price) -> { System.out.println(price+(price*10/100));};
		Consumer<Integer> tax = (price) -> { System.out.println((price*10/100));};
		
		List<Integer> rate = Arrays.asList(2000,3200,5000,1200,4999);
		for(Integer x : rate) {
			netPrice.accept(x);
		}
		netPrice.andThen(tax).accept(24000);
		

	}

}
