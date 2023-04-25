package com.OnSoft.training;

public class Contains {
	
	public static void main(String[] args) {
//        if (args.length != 2) {
//            System.out.println("Please provide two arguments: the main string and the search term");
//            return;
//        }
        
        String mainString = "plague";
        String searchTerm = "game";
        
        if (mainString.contains(searchTerm)) {
            if (mainString.equals(searchTerm)) {
                System.out.println("FULL PRESENT");
            } else {
                System.out.println("ALL SCATTERED");
            }
        } else if (hasAllChars(mainString, searchTerm)) { 
            System.out.println("SOME SCATTERED");
        } else {
            System.out.println("NONE PRESENT");
        }
    }
    
    public static boolean hasAllChars(String s1, String s2) {
        for (char c : s2.toCharArray()) {
            if (s1.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

}
