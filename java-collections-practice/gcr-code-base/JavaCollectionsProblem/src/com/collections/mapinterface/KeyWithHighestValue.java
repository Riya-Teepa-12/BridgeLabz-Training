package com.collections.mapinterface;

import java.util.Map;
import java.util.*;

public class KeyWithHighestValue {
	static int max=0;
	static char c='\u0000';
	public static Character keyWithHighestValue(Map<Character,Integer> map){
		for(Map.Entry<Character,Integer> e: map.entrySet()) {
	    
			if(e.getValue()>max) {
				max=e.getValue();
				 c=e.getKey();
			}
			
		}
		return c;
		
	}
	public static void main(String []args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the number of character");
		int n=kb.nextInt();
		char c;
		System.out.println("Enter character :");
		System.out.println("Then Enter  value :");
		int number;
		Map<Character,Integer> map1 = new HashMap<>();
		for(int i=0;i<n;i++) {
			
			map1.put(c=kb.next().charAt(0),number=kb.nextInt());
		}
		System.out.println("The Character is "+keyWithHighestValue(map1));
		
	}

}
