package com.linearandbinarysearch.stringbuffer;

import java.util.Scanner;

public class ConcateString {
	
	public static String concateString(String arr[]) {
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<arr.length;i++) {
			sb.append(arr[i]);
		}
		return sb.toString();
	}
	public static void main(String [] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter no of strings you want to concatenate: ");
		int n= kb.nextInt();
		String s[] = new String[n];
		System.out.println("Enter String one by one:");
	    for(int i=0;i<n;i++) {
	    	s[i]=kb.next();
	    }
		String concate = concateString(s);
		System.out.println("After concating String is :"+concate);
	}

}
