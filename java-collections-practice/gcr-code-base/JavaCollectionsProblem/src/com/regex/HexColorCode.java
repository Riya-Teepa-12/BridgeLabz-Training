package com.regex;

import java.util.*;

public class HexColorCode {
   
	public static void main(String []args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the Hex colour Code:");
		String hexCode = kb.next();
		String regex="^#[0-9A-Fa-f]{6}$";
		if(hexCode.matches(regex)) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		kb.close();
	}
}
