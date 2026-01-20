package com.collections.setinterface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SymmetricDifference {

	
	public static Set<Integer> findSymmetricDifference(Set<Integer> s1, Set<Integer> s2){
		Set<Integer> s3 = new HashSet<>();
	         for(int x:s1) {
	        	 if(!s2.contains(x))
	        	    s3.add(x);
	         }
	         for(int x:s2) {
	        	 if(!s1.contains(x))
	        	    s3.add(x);
	         }
	         return s3;
	}
	
	public static void main(String []args) {
		Scanner kb = new Scanner(System.in);
		   
		   System.out.println("Enter the values in set 1");
		   
		   Set<Integer> set1 = new HashSet<>();
		   for(int i=0;i<3;i++) {
			   set1.add(kb.nextInt());
		   }
		   
		   System.out.println("Enter the values in set 2");
		   
		   Set<Integer> set2 = new HashSet<>();
		   for(int i=0;i<3;i++) {
			   set2.add(kb.nextInt());
		   }
		  
	
		   
		  
		   System.out.println("Symmetric Difference is"+findSymmetricDifference(set1,set2));
	  
		   
	}
	
}
