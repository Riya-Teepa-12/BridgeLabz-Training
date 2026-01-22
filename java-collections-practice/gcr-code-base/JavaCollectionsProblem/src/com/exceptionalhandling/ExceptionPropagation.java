package com.exceptionalhandling;

import java.util.*;

public class ExceptionPropagation {
	
	//method to calculate interest
	public static double calculateInterest(double amount,double rate,int years) throws IllegalArgumentException{
		  if (amount < 0 || rate < 0) {
	            throw new IllegalArgumentException("Amount and rate must be positive");
	        }
		double simpleInterest = amount * rate * years/100;
		return simpleInterest;
	 }
   public static void main(String []args) {
	   Scanner kb = new Scanner(System.in);
	   System.out.println("Enter the amount");
	   double amount = kb.nextDouble();
	   System.out.println("Enter the rate");
	   double rate = kb.nextDouble();
	   System.out.println("Enter the years");
	   int years = kb.nextInt();
	   try {
           double interest = calculateInterest(amount, rate, years);
           System.out.println("Calculated Interest: " + interest);

	   }catch(IllegalArgumentException ex) {
		   System.out.println( "Invalid input: Amount and rate must be positive");
	   }
	   
	   kb.close();
   }
}
