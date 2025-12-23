import java.util.*;
public class ReverseString{
   public static String reverseString(String s){
      String str="";
      for(int i=s.length()-1;i>=0;i--){
	    str+=s.charAt(i);
	  }
      return str;
	 }
   public static void main(String []args){
      Scanner input = new Scanner(System.in);
	  
	  //taking string as input from the user
	  System.out.println("Enter the string");
	  String s=input.next();
	  
	  //displaying the result
	  String str=reverseString(s);
	  System.out.println("The given string is "+s);
	  System.out.println("The reversed string is "+str);
	  
	  input.close();
	  
   }
 }