import java.util.*;
public class PalindromeString{

   //method to check string is palindrome or not
     public static boolean palindromeString(String s){
	  
          for(int i=0;i<s.length();i++){
		  if(s.charAt(i)!=s.charAt(s.length()-1-i))
		     return false;
		}
	  return true;
	 }
   public static void main(String []args){
      Scanner input = new Scanner(System.in);
	  
	  //taking string as input from the user
	  System.out.println("Enter the string");
	  String s=input.next();
	  
	  //displaying the result
	    boolean flag=palindromeString(s);
	     if(flag)
		 System.out.println("Yes the string is palindrome");
		 else
		  System.out.println("No the string is not palindrome");
	  input.close();
	  
   }
 }