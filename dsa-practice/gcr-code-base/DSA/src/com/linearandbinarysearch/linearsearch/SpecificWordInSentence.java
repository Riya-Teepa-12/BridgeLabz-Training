package com.linearandbinarysearch.linearsearch;

import java.util.*;

public class SpecificWordInSentence {
	
	public static String searchSpecificWord(String s[],String words) {
	     for(int i=0;i<s.length;i++) {
	    	 String st = s[i];
	    	 String word[]= st.split(" ");
	    	 for(int j=0;j<word.length;j++) {
	    		 if(word[j].equals(words))
	    			 return st;
	    	 }
	  
	     }
	   	return "Not Founded"; 
	}
    public static void main(String []args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter the number of sentences: ");
    	int number = input.nextInt();
    	System.out.println("Enter the sentences: ");
    	String string[] = new String[number];
    	input.nextLine();
    	for(int i=0;i<number;i++) {
    		
    		string[i] = input.nextLine();
    		
    	}
    	System.out.println("Enter the word you want to find");
    	String str = input.next();
    	
    	//calling the method
    	String found = searchSpecificWord(string,str);
    	
    	//display the result
    	System.out.println("The sentence is "+found);
    	
    	
    }
}
