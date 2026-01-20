package com.collections.setinterface;

import java.util.*;

public class FindSubsets {
	public static boolean checkSubset(Set<Integer> set1,Set<Integer> set2) {
		boolean flag = false;
		for(int x:set2) {
			if(set1.contains(x))
				flag = true;
		}
		return flag;
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
		   boolean flag = checkSubset(set1,set2);
		   if(flag)
		  System.out.println("Yes it is a subset");
		   else
		  System.out.println("No, it is not a subset");

	}

}
