package com.regex;

import java.util.*;

public class ReplaceAndModifyStrings {
   public static void main(String []args) {
	   Scanner kb = new Scanner(System.in);
	   System.out.println("Enter the Text:");
	   String text = kb.nextLine();
	   String regex = "\\s+";
	   String output = text.replaceAll(regex, " ");
	   System.out.println(output);
	   kb.close();
   }
}
