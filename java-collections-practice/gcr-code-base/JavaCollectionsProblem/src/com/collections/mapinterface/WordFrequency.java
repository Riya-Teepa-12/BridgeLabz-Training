package com.collections.mapinterface;

import java.util.*;
import java.util.Map.Entry;

public class WordFrequency {
    
	public static Map<String,Integer> checkWordFrequency(String s){ 
		Map<String,Integer> map = new HashMap<>();
		String str[] = s.split("\\s+");
		for(int i=0;i<str.length;i++) {
			map.put(str[i], map.getOrDefault(str[i],0)+1);
		}
		
		return map;
	}
	public static void main(String []args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s1 = kb.nextLine();
		Map<String,Integer> map1 = new HashMap<>(); 

		map1 = checkWordFrequency(s1);
		System.out.println(map1.size());
		for(Entry e: map1.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}
