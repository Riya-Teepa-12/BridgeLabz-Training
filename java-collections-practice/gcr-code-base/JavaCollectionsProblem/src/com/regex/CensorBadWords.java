package com.regex;

import java.util.*;

public class CensorBadWords {
   public static void main(String []args) {
	   Scanner kb = new Scanner(System.in);
	   List<String> word = new ArrayList<>();
	   word.add("damn");
	   word.add("stupid");
	   word.add("dump");
	   word.add("bump");
	   System.out.println("Enter the Text:");
	   String text = kb.nextLine();
	   String regex="****";
	   String atr[] = text.split("\\s+");
	   for(int i=0;i<atr.length;i++) {
		   String s = atr[i];
		   for(int j=0;j<word.size();j++) {
		   if(word.get(j).equals(s))
		   text=text.replaceAll(s,regex);
		   
		   }
	   }
	   System.out.println(text);
	   
	   kb.close();
   }
}
