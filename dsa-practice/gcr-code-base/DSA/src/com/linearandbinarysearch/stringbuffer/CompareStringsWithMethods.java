package com.linearandbinarysearch.stringbuffer;

import java.util.Scanner;

public class CompareStringsWithMethods {
	
	public static String concateStringUsingBuffer(String arr[]) {
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<arr.length;i++) {
			sb.append(arr[i]);
		}
		return sb.toString();
	}
	
	
	public static String concateStringUsingBuilder(String arr[]) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			sb.append(arr[i]);
		}
		return sb.toString();
	}
	
   
	
    public static void main(String []args) {
    	Scanner kb = new Scanner(System.in);
		System.out.println("Enter no of strings you want to concatenate: ");
		int n= kb.nextInt();
		String s[] = new String[n];
		System.out.println("Enter String one by one:");
	    for(int i=0;i<n;i++) {
	    	s[i]=kb.next();
	    }
	    long start = System.nanoTime();
	    
		String builder = concateStringUsingBuilder(s);
		  long end = System.nanoTime();
		  long start1= System.nanoTime();
		String buffer= concateStringUsingBuffer(s);
		long end1 = System.nanoTime();
		System.out.println("After concating String Using String Builder is :"+builder+" The time taken to run method is "+(end-start)+" ns");
		System.out.println("After concating String Using String Buffer is :"+buffer+" The time taken to run method is "+(end1-start1)+" ns");
    }
}
