 import java.util.*;
 public class Palindrome{
 
 
    //method to display the result
      public static void displayOutput(boolean s){
		if(s)
	   System.out.println("It is palindrome ");
       else
		System.out.println("It is not a palindrome ");   
	}

    //check palindrome
     public static boolean checkPalindrome(String string){
	    for(int i=0;i<string.length()/2;i++)
		{
		  if(string.charAt(i)!=string.charAt(string.length()-1-i)){
		     return false;
		  }
		}
	  return true;
	}
	
	//method to take the input
    public static String takeInput(){
	   Scanner input = new Scanner(System.in);
	   System.out.println("Enter a string : ");
	   String str = input.next();
	   return str;
	}
   public static void main(String []args){
      
	//calling the method
	  String str= takeInput();
	  boolean res = checkPalindrome(str);
	  displayOutput(res);
   }
 }