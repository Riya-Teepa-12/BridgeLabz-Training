package com.collections.setinterface;

import java.util.*;
public class SetIntoSortedList {
    
	public static List<Integer> setIntoList(Set<Integer> s){
		List<Integer> list = new ArrayList<>();
		for(int x:s) {
			list.add(x);
		}
		
		for(int i =0;i<list.size()-1;i++) {
		   int a = 	list.get(i);
		   int b = 	list.get(i+1);
		   if(a>b)
		   {
			   int temp = b;
			   list.set(b,a);
			   list.set(a, temp);
		   }
		}
		return list;
	}
	public static void main(String []args) {
	 Set<Integer> set = new HashSet<>();
	    Scanner kb = new Scanner(System.in);
	    System.out.println("Enter the numbers of elements you want to add in set");
	    int n = kb.nextInt();
	    for(int i=0;i<n;i++) {
	    	set.add(kb.nextInt());
	    }
	    
	    System.out.println("List is "+setIntoList(set));
	    
	}
}
