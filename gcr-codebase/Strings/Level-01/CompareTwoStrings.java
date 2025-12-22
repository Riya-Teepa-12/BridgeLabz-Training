 import java.util.*;
 class CompareTwoStrings{
    
	//create a method to compare strings using charAt() method
	public boolean compareStrings(String string1, String string2){
	   if(string1.length()!=string2.length())
	    return false;
	   for(int i=0;i<string1.length();i++){
	         if(string1.charAt(i)!=string2.charAt(i))
			 return false;
	    }
	  return true;
	}
   
     //create a method to compare strings using built-in method
	 public boolean compareStrings1(String string1, String string2){
	    if(string1.length()!=string2.length())
	    return false;
	    return string1.equals(string2);
	 }
    public static void main(String []args){
     Scanner input = new Scanner(System.in);
	 
	  //taking input two strings variable from the user
	  System.out.println("Enter the string 1:");
	  String string1 = input.next();
	  
	  System.out.println("Enter the string 2:");
	  String string2 = input.next();
	  
	  //creating class object and calling the methods
	  CompareTwoStrings check = new CompareTwoStrings();
	   boolean    result   = check.compareStrings( string1, string2);
	   boolean    result1   = check.compareStrings1( string1, string2);
	   
	   //displaying the result
	   System.out.println("Using charAt() method " +result);
	   System.out.println("Using built-in method "+result1);
	   if(result && result1)
		System.out.println("yes");
	   else
		System.out.println("no");
	  
  }
 }