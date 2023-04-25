package com.OneSoft.functionInterface_Homework;

import java.util.function.Function;

public class UseType1_FunctionInterface {

	public static void main(String[] args) {
		
		Function<Integer, Double> add = (x)-> x/2.0;
		
//		add = add.andThen(a-> a/2);
		
		add = add.compose(c-> 3 * c);
		
		add = add.andThen(z-> z * 2);
		
		System.out.println(add.apply(5));
		System.out.println();
//------------------------------------------------------------------------------
		
		Function<String, Integer> function = (x) -> x.length();
		System.out.println(function.apply("Vivekbabu"));
		System.out.println();
		
//--------------------------------------------------------------------------------		
		
		Function<Integer, Integer> function1 = (x) -> x * 2;
		
		int res = function.andThen(function1).apply("Vivekbabu");
		
		System.out.println(res);
	}

}
