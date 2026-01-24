package com.regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPAddress {
    public static void main(String []args) {
    	Scanner kb = new Scanner(System.in);
    	System.out.println("Enter the IP Address:");
    	String ipAddress = kb.next();
    	Pattern p=Pattern.compile("^([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\."
				+ "([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\."
				+ "([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\."
				+ "([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
    	Matcher matcher = p.matcher(ipAddress);
    	if(matcher.matches()) {
    		System.out.println("Valid Ip Address");
    	}
    	else {
    		System.out.println("Invalid Ip Address");
    	}
    	kb.close();
    }
}
