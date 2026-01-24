package com.streams;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReadInputConsole {
   
	 public static void main(String []args) {
	    	FileWriter n=null;
	    	BufferedReader bd = new BufferedReader(new InputStreamReader(System.in));
	    	try {
	    		System.out.println("Enter the name");
	    	  String name=   bd.readLine();
	    	  System.out.println("Enter the age");
	    	  int  age=Integer.parseInt(bd.readLine());
	    	  System.out.println("Enter your Favourite Language ");
	    	  String favLanguage = bd.readLine();
	    	  
	    	  n = new FileWriter("C:\\Users\\riya6\\OneDrive\\Desktop\\riya_teepa86.java");
	    	  n.write("Name"+name);
	    	  n.write("Age"+age);
	    	  n.write("Favourite Language "+favLanguage);
	    	  System.out.println("Data Added Successfully!");
	    	}catch(IOException e) {
	    		System.out.println("Data not copied");
	    	}finally {
	    		try {
	    		if(n!=null)n.close();
	    		}catch(IOException e ) {
	    			System.out.println("Null value");
	    		}
	    	}
 }
}
