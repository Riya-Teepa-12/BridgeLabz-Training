package com.regex;

import java.util.*;

public class LicensePlateBNumber {
   
	public static void main(String []args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the Licence Plate Number");
		String plateNumber = kb.next();
		String regex = "^[A-Z]{2}\\d{4}$";
		if(plateNumber.matches(regex)) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		kb.close();
	}
}
