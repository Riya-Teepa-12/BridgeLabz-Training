package com.exceptionalhandling;

import java.util.*;

public class FinallyBlockException {
	
   public static void main(String []args) {
	   Scanner kb = new Scanner(System.in);
	   try {
		   System.out.println("Enter the 1st Integer");
		   int integer1 = kb.nextInt();
		   System.out.println("Enter the 2nd Integer");
		   int integer2 = kb.nextInt();
		   int d= integer1/integer2;
		   System.out.println("The Result of Division is "+d);
	   }catch(ArithmeticException ex) {
		   System.out.println("Denominator Should not be zero");
	   }finally {
		   System.out.println("Operation Completed");
	   }
	   kb.close();
   }
}
