package com.regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatingWords {
   public static void main(String []args) {
	   Scanner kb = new Scanner(System.in);
       System.out.println("Enter the Text");
       String text = kb.nextLine();
       String regex = "\\b(\\w+)\\b\\s+\\1\\b";
       Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
       Matcher matcher = pattern.matcher(text);

       while (matcher.find()) {
           System.out.println(matcher.group(1));
       }
   
	   kb.close();
   }
}
