package com.OneSoft.java8_Features;

public class UseFindNumbersFunctions {
	
	public static void main(String[] args) {
		int[] nums = {234,347,568,62,7467,-45,-63,-5772};
		FindNumbersFunctions max = Methods :: findMax;
		System.out.println(max.findNum(nums));
		
//-------Same return type(Interface method and Methods class) ->
//		->               only we can use Method Reference -----------
		
		FindNumbersFunctions pos = Methods :: findPositiveNumbers;
		System.out.println(pos.findNum(nums));
		
		
		
	}

}
