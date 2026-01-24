package com.regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSSN {
  public static void main(String []args){
	  Scanner kb = new Scanner(System.in);
	  System.out.println("Enter the Text");
	  String text = kb.nextLine();
	  String regex="\\b\\d{3}-\\d{2}-\\d{4}\\b";
	  Pattern pattern = Pattern.compile(regex);
	  Matcher matcher = pattern.matcher(text);
	  if(matcher.find()) {
		  System.out.println("Social Security Number is valid");
	  }
	  else {
		  System.out.println("Social Security Number is invalid");
	  }
	  kb.close();
  }
}
