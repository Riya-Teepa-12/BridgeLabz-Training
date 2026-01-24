package com.regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalizedWords {
  public static void main(String []args) {
	  Scanner kb = new Scanner(System.in);
	  System.out.println("Enter the text:");
	  String s=kb.nextLine();
	  
	  String regex = "\\b[A-Z][a-z]+\\b";
	  Pattern p = Pattern.compile(regex);
	  Matcher matcher = p.matcher(s);
	  while(matcher.find()) {
		  System.out.println(matcher.group());
	  }
	  
	  kb.close();
  }
}
