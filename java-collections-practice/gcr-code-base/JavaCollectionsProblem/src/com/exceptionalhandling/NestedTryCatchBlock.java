package com.exceptionalhandling;

import java.util.*;

public class NestedTryCatchBlock {
     
	 public static void main(String []args) {
		Scanner kb = new Scanner(System.in); 
		int arr[]= null;
		try {
			System.out.println("Input the array size");
			int n= kb.nextInt();
			arr = new int[n];
			for(int i =0;i<n;i++) {
				 arr[i] = kb.nextInt();
			}
		System.out.println("Enter the index");
			int index = kb.nextInt();
		  System.out.println("Enter the divisor");
		  int divisor = kb.nextInt();
		  int c=arr[index]/divisor;
		  System.out.println("The devision Result is "+c);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Invalid array index!");
		}catch(ArithmeticException  ex) {
			System.out.println("Cannot divide by zero!");
		}
		kb.close();
	 }
}
