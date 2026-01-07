package com.linearandbinarysearch.stringbuilder;

import  java.util.*;

public class ReverseString {
	 
	//method to reverse the string
	 public static String reverse(String s) {
		 StringBuilder sb= new StringBuilder();
		 for(int i=s.length()-1;i>=0;i--) {
			 sb.append(s.charAt(i));
		 }
		 return sb.toString();
		 
	 }
	 
     public static void main(String [] args) {
    	 //create scanner object take input from the user
    	 Scanner input = new Scanner(System.in);
    	 
    	 
    	 System.out.println("Enter the string you want to reverse: ");
    	 //taking string as the input from the user
    	  String str=input.nextLine();
    	  
    	  //call the method
    	   String s=reverse(str);
    	   
    	   System.out.println("The Reverse String is: "+s);
     }
}
