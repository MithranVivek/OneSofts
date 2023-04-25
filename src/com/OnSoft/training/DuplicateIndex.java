package com.OnSoft.training;

import java.util.HashMap;

public class DuplicateIndex {
	    
	    public static void main(String[] args) {
	        String str = "hello world";
	        HashMap<Character, Integer> map = new HashMap<>();
	        System.out.println(str.lastIndexOf('l'));
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (map.containsKey(c)) {
	                System.out.println("Duplicate character '" + c + "' found at index " + i);
	                break;
	            } else {
	                map.put(c, i);
	            }
	        }
	    }
}
