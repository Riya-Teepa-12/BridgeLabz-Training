package com.collections.mapinterface;

import java.util.*;

public class MergeTwoMap {
	
	public static void main(String []args) {
		  Map<Character, Integer> map1 = new HashMap<>();
	        map1.put('A', 1);
	        map1.put('B', 2);

	        Map<Character, Integer> map2 = new HashMap<>();
	        map2.put('B', 3);
	        map2.put('C', 4);

	        Map<Character, Integer> result = new HashMap<>();

	        // First map
	        for (Map.Entry<Character, Integer> e : map1.entrySet()) {
	            result.put(e.getKey(), e.getValue());
	        }

	        // Second map
	        for (Map.Entry<Character, Integer> e : map2.entrySet()) {
	            if (result.containsKey(e.getKey())) {
	                int sum = result.get(e.getKey()) + e.getValue();
	                result.put(e.getKey(), sum);
	            } else {
	                result.put(e.getKey(), e.getValue());
	            }
	        }

	        System.out.println(result);
	    }
	}


