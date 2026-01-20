package com.collections.setinterface;

import java.util.*;

public class UnionAndIntersection {
    
	public static Set<Integer> makeUnion(Set<Integer> s1, Set<Integer> s2){
		Set<Integer> s3 = new HashSet<>();
	                 s3.addAll(s1);
	                 s3.addAll(s2);
		return s3;
	}
	
	public static Set<Integer> makeIntersection(Set<Integer> s1, Set<Integer> s2){
		Set<Integer> s3 = new HashSet<>(); 
		for(int x:s1) {
			if(s2.contains(x)) {
				s3.add(x);
			}
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
		  
	
		   
		  
		   System.out.println("Union of Elements"+makeUnion(set1,set2));
		   System.out.println("Intersection of Elements"+makeIntersection(set1,set2));   
		   
	}
}
