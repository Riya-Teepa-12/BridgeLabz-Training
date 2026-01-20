package com.collections.listinterface;

import java.util.*;
public class RotateElement {
	
	
    public static List<Integer> rotateList(List<Integer> list,int k){
    	  List<Integer> list1 = new ArrayList<>();
    	  int c=k;
    	    for(int i=k;k<list.size();k++) {
    	    	list1.add(list.get(k));
    	    }
    	    for(int i=0;i<c;i++) {
    	    	list1.add(list.get(i));
    	    }
    	    
    	 return list1;
    }
	public static void main(String []args) {
		Scanner kb = new Scanner(System.in);
		  System.out.println("Enter the five number you want to rotate");
		  List<Integer> list = new ArrayList<>();
		  for(int i=0;i<5;i++) {
			  list.add(kb.nextInt());
		  }
		  System.out.println("Enter the value from which you want array to rotate");
		  int k = kb.nextInt();
		  System.out.println(rotateList(list,k));
		  
	}
}
