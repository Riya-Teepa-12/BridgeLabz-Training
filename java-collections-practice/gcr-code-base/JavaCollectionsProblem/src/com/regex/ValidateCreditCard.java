package com.regex;

import java.util.*;

public class ValidateCreditCard {
   public static void main(String []args) {
	   
	   //creating scanner object for taking input from user
	   Scanner kb = new Scanner(System.in);
	   System.out.println("Enter the Credit Card Number in the Format : \nxxxx xxxx xxxx xxxx");
	   String creditNumber = kb.nextLine();
	   String regex = "^(4|5)[0-9]{3} [1-9]{4} [1-9]{4} [1-9]{4}$";
	   //checking the credit number is valid or not
	   if(creditNumber.matches(regex)) {
		   System.out.println("Valid Card Number");
	   }
	   else {
		   System.out.println("Invalid Card Number");
	   }
	   kb.close();
   }
}
