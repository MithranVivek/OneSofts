package com.OnSoft.training;

public class Contains1 {
	
	public static void main(String[] args) {
		String mainString = "playgame";
        String searchTerm = "z";
        int count =0;
        
        if (mainString.contains(searchTerm)||mainString.equalsIgnoreCase(searchTerm)) {
                System.out.println("FULL PRESENT");
            } 
         else if (hasAllChars(mainString, searchTerm)) { 
            System.out.println("ALL SCATTERED");
        }else if(count==0){
            System.out.println("SOME SCATTERED");
        }
         else {
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
   
    public static int hasSomeChars(String s1, String s2) {
    	int count =0;
        for (char c : s1.toCharArray()) {
            if (s2.indexOf(c) == -1) {
            	 count = count+1;
                return count;
            }
        }
        return count;
    }

}
