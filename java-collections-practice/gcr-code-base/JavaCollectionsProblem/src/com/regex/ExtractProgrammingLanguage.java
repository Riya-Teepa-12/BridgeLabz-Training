package com.regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguage {
	
   public static void main(String []args){
	  Scanner kb = new Scanner(System.in);  
	  System.out.println("Enter the Text:");
	  String s=kb.nextLine();
	  String regex = "\\bJava|Python|JavaScript|Go\\b";
	  Pattern pattern = Pattern.compile(regex);
	  Matcher matcher = pattern.matcher(s);
	  
	  while(matcher.find()) {
		  System.out.println(matcher.group());
	  }
	  kb.close();
   }
}
