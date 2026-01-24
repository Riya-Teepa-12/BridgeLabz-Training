package com.regex;

import java.util.*;


public class ValidateUsername {
    public static void main(String []args) {
    	Scanner kb = new Scanner(System.in);
    	System.out.println("Enter The Username");
    	String username = kb.next();
    	String regex = "[A-Za-z][A-Za-z0-9_]{4,14}$";
    	
    	if(username.matches(regex)) {
    		 System.out.println("Valid Username");
    	}
    	else {
    		 System.out.println("InValid Username");
    	}
    	kb.close();
    }
}
