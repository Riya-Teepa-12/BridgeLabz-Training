import java.util.*;
public class LongestWordString{

   //method to find the longest word in the string
     public static String longestWordString(String s){
	     String str[]=s.split("\\s+");
		     int count=0;
			 int max=0;
			 String result="";
          for(int i=0;i<str.length;i++){
			   String stt=str[i];
			   for(int j=0;j<stt.length();j++){
			     count++;
			   }
			   if(count>max){
			   max=count;
			    result= str[i];
			   }
		 }
	  return result;
	 }
   public static void main(String []args){
      Scanner input = new Scanner(System.in);
	  
	  //taking string as input from the user
	  System.out.println("Enter the string");
	  String s=input.next();
	  
	  //displaying the result and calling the method
	    String str=longestWordString(s);
		  System.out.println("The string after removing duplicate is "+ str);
	  input.close();
	  
   }
 }