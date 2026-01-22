package com.exceptionalhandling;

import java.util.*;

public class MultipleCatchBlock {
      public static void main(String []args) {
    	  Scanner kb = new Scanner(System.in);
    	  System.out.println("Enter Element 5 elements");
    	  int arr[] = new int[5];
    	  try {
    		  for(int i=0;i<arr.length;i++) {
    			  arr[i] = kb.nextInt();
    		  }
    		System.out.println("Enter index number");
    		int index = kb.nextInt();
    		System.out.println(" Value at index "+index+" is "+arr[index]);
    		  
    	  }catch(ArrayIndexOutOfBoundsException ex) {
    		  System.out.println("Invalid index!");
    	  }catch(NullPointerException ex) {
    		  System.out.println("Array is not intialized!");
    	  }
    	  kb.close();
      }
	
}
