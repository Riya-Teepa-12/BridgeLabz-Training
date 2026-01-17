package com.Day5.robowarehouse;

import java.util.ArrayList;
import java.util.List;

public class ShelfLoadingRobot {
	
	
	  List<Double> list = new ArrayList<>();
	   //method to add the package
      public void addPackage(double weight) {
    	  list.add(weight);
    	     for(int i=list.size()-1;i>0;i--) {
    	    	 double w1 = list.get(i);
    	    	 double w2 = list.get(i-1);
    	    	 if(w1<w2) {
    	    		 list.set(i-1, w1);
    	    		 list.set(i, w2);
    	    	 }
    	    	 else {
    	    		 break;
    	    	 }
    	     }
      }
      
      public void showDetails() {
    	  for(double x:list) {
    		  System.out.println(x);
    	  }
      }
}
