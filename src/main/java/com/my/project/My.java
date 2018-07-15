package com.my.project;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class My {
	public static void main(String[] args) {
		List<String> s = new ArrayList<String>();
		s.add("Aditya");
		s.add("Calangutkar");
		s.add("LTI");
		
		for(String a:s){
			System.out.println(a);
		}
		
		Set<String> set  = new LinkedHashSet();
		set.add("Aditya");
		set.add("Calangutkar");
		set.add("LTI");
		
		for(String d:set){
			System.out.println(d);
		}
		
	}
}
