package com.linearandbinarysearch.stringbuilder;

import java.util.*;

public class RemoveDuplicate {
	
	public static String removeDuplicate(String s) {
		StringBuilder sb = new StringBuilder();
		Set<String> set = new HashSet<>();
		for(int i=0;i<s.length();i++) {
		    if(set.add(String.valueOf(s.charAt(i)))) {
		    	sb.append(s.charAt(i));
		    }
		}
		return sb.toString();
	}
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = input.nextLine();
		String reversed = removeDuplicate(str);
		System.out.println("After removing duplicate character the string is:");
		System.out.println(reversed);
		
	}

}
