package com.OneSoft.collections2_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class UseCustomer {
	
	public static void main(String[] args) {
		CustomerDetails c1 = new CustomerDetails("vivek", 31, 234635, 245646954321l, "male");
		CustomerDetails c2 = new CustomerDetails("Dhinesh", 31, 336757, 245634695320l, "male");
		CustomerDetails c3 = new CustomerDetails("Raji", 26, 13446, 245678346323l, "female");
		CustomerDetails c4 = new CustomerDetails("Kannan", 19, 196564, 245676340325l, "male");
		
		HashMap<Long, CustomerDetails> aadhaar = new HashMap<>();
		aadhaar.put(c1.getAadhaarNo(), c1);
		aadhaar.put(c2.getAadhaarNo(), c2);
		aadhaar.put(c3.getAadhaarNo(), c3);
		aadhaar.put(c4.getAadhaarNo(), c4);
		
		aadhaar.forEach((x,y)-> System.out.println(x+" "+y));
		System.out.println();
		
		Iterator<CustomerDetails> itr = aadhaar.values().iterator();
		while(itr.hasNext()) {
			if(itr.next().getAge()<30) {
				itr.remove();
			}
		}
		
		aadhaar.forEach((x,y)-> System.out.println(x+" "+y));
		
		HashMap<Long, CustomerDetails> amt = new HashMap<>();
		
		for(Long x : aadhaar.keySet()) {
			if(aadhaar.get(x).getAmountAvailable()<200000 && aadhaar.get(x).getAge()<23) {
				amt.put(x, aadhaar.get(x));
			}
		}
		
		amt.forEach((x,y)-> System.out.println(x+" "+y));
		
		int min = c1.getAge();
		CustomerDetails temp = null;
		for(CustomerDetails x : aadhaar.values()) {
			if(x.getAge()<=min) {
				min = x.getAge();
				temp = x;
			}
		}
		System.out.println(temp);
		System.out.println();
		
		Set<Entry<Long,CustomerDetails>> e = aadhaar.entrySet();
		for(Entry<Long, CustomerDetails> x : e) {
			System.out.println(x);
		}
		e.forEach(x->System.out.println(x));
		
		Iterator<CustomerDetails> itr1 = aadhaar.values().iterator();
		while(itr1.hasNext()) {
			if(itr1.next().getGender().equals("male")) {
				itr1.remove();
			}
		}
		aadhaar.values().forEach(x->System.out.println(x));
		System.out.println();
		
		Iterator<Long> itr2 = aadhaar.keySet().iterator();
		while(itr2.hasNext()) {
			if(aadhaar.get(itr2.next()).getAge()<30) {
				itr2.remove();
			}
		}
		aadhaar.forEach((x,y)->System.out.println(x+" "+y));
		
	}

}
