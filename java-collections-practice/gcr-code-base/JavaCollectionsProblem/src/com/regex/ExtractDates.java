package com.regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
    public static void main(String []args) {
    	Scanner kb = new Scanner(System.in);
    	System.out.println("Enter the Text:");
    	String t=kb.nextLine();
    	String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
    	Pattern pattern = Pattern.compile(regex);
    	Matcher matcher = pattern.matcher(t);
    	while(matcher.find()) {
    		System.out.print(matcher.group()+" ");
    	}
    	kb.close();
    }
}
