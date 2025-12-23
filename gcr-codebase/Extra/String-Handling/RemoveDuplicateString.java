import java.util.*;
public class RemoveDuplicateString{

   //method to remove duplicate from string
     public static String removeDuplicateString(String s){
	     String str="";
		
          for(int i=0;i<s.length();i++){
			  boolean flag=true;
		     for(int j=i+1;j<s.length();j++){
			   if(s.charAt(i)==s.charAt(j))
			   {
				   flag=false;
				   break;
			   }
		       }
			   if(flag)
				str+=s.charAt(i);
			   
		}
	  return str;
	 }
   public static void main(String []args){
      Scanner input = new Scanner(System.in);
	  
	  //taking string as input from the user
	  System.out.println("Enter the string");
	  String s=input.next();
	  
	  //displaying the result and calling the method
	    String str=removeDuplicateString(s);
		  System.out.println("The string after removing duplicate is "+ str);
	  input.close();
	  
   }
 }