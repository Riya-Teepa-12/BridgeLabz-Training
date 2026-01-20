package com.collections.listinterface;

import java.util.*;
import java.util.Map.Entry;

public class ElementFrequency {
      public static void main(String []args) {
    	  Scanner input= new Scanner(System.in);
    	  String string [] = new String[5];
    	  for(int i=0;i<5;i++) {
    	    string[i] = input.next();
    	  }
    
    	  Map<String,Integer> map = new HashMap<>();
    	  for(int i=0;i<string.length;i++) {
    		  map.put(string[i],map.getOrDefault(string[i], 0)+1);
    	  }
    	  
    	  for(Map.Entry<String, Integer>  e :map.entrySet()) {
    		   System.out.println(e.getKey()+" "+e.getValue());
    	  }
    	  
      }
}

