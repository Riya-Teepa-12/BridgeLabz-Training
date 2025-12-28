package com.constructor.Level1;

import java.util.Scanner;

public class Circle {
      //attributes
	   private double radius;
	   
	   //creating default constructor
	   public Circle() {
		   Scanner input = new Scanner(System.in);
	       System.out.println("Enter the Radius");
	       double rad = input.nextDouble();
	        System.out.println("User Radius " + rad);
	        input.close();
		   
		}
	   
	   public Circle(double radius) {
		   this();
		    System.out.println("Default " +radius);
		 }
	   
	 
	   
	  public static void main(String[] args) {
	     
	     Circle cr = new Circle(20);
	     
	     
	      

	     
	}

}
