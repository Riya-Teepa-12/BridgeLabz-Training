package com.exceptionalhandling;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {
     
	 public static void main(String[] args) {

	        try {
	            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\riya6\\OneDrive\\Desktop\\BridgeLabz-Training\\java-collections-practice\\gcr-code-base\\JavaCollectionsProblem\\src\\com\\exceptionalhandling\\data.txt"));
	            String line;

	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }

	            br.close();
	        } 
	        catch (IOException e) {
	            System.out.println("File not found");
	        }
	    }
}
