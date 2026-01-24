package com.regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrency {
    public static void main(String []args) {
    	Scanner kb = new Scanner(System.in);
    	System.out.println("Enter the Text: ");
    	String text = kb.nextLine();
    	String regex="\\$?\\d+\\.\\d{2}";
    	Pattern pattern = Pattern.compile(regex);
    	Matcher matcher = pattern.matcher(text);
    	
    	while(matcher.find()){
    		System.out.println(matcher.group());
    	}
    	kb.close();
    }
}
