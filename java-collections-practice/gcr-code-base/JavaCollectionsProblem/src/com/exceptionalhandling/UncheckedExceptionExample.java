package com.exceptionalhandling;

import java.util.*;

public class UncheckedExceptionExample {
     
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		int d=0;
		try {
			int a = input.nextInt();
			int b=  input.nextInt();
		  d =a/b;
		  System.out.println(d);
		}catch(ArithmeticException ex) {
			System.out.println("Denominator cannot be zero");
		}catch(InputMismatchException ex) {
			System.out.println("Please enter a numeric value");
		}
		input.close();
	}
}
