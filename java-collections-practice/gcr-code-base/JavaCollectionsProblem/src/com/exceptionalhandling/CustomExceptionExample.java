package com.exceptionalhandling;

import java.util.*;


class InvalidAgeException extends Exception {
    
	 public InvalidAgeException(String s) {
		 super(s);
		 
	 }
}


public class CustomExceptionExample{
	 public static void validateAge(int age) throws InvalidAgeException{
		 if(age<=18) {
			 
			 throw new InvalidAgeException("Age shoud be 18 or above");
		 }
		 else {
			System.out.println("Access Granted!"); 
		 }
		 
	 }
	 public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    int age = input.nextInt();

		    try {
		        validateAge(age);
		    } catch (InvalidAgeException e) {
		        System.out.println(e.getMessage());
		    }

		    input.close();
		}
 
}
