package com.collections.setinterface;

import java.util.*;

public class EqualSet {
   public static boolean checkSet(Set<Integer> s1,Set<Integer> s2)  {
	   boolean flag=false;
	   if(s1.size()!=s2.size())
		   return false;
	   else{
		   for(int i=0;i<s1.size();i++)
		   if(s1.contains(s2)){
			   flag = true;
		   }
		   else {
			   return false;
		   }
	   
	   }
	   return flag;
	   
   }
   
   public static void main(String []args) {
	   Scanner kb = new Scanner(System.in);
	   
	   System.out.println("Enter the values in set 1");
	   
	   Set<Integer> set1 = new HashSet<>();
	   for(int i=0;i<5;i++) {
		   set1.add(kb.nextInt());
	   }
	   
	   System.out.println("Enter the values in set 2");
	   
	   Set<Integer> set2 = new HashSet<>();
	   for(int i=0;i<5;i++) {
		   set2.add(kb.nextInt());
	   }
	  
	   boolean flag = checkSet(set1,set2);
	   if(flag)
	   System.out.println("Set is equal");
	   else
	   System.out.println("Set is not equal");   
	   
   }
	 
}
