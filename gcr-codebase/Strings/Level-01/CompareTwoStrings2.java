import java.util.*;
 class CompareTwoStrings2{
    
	
	 //create a method to compare strings 
	public boolean compareStrings(String s1, String s2){
	   if(s1.length()!=s2.length())
	    return false;
	   for(int i=0;i<s1.length();i++){
	         if(s1.charAt(i)!=s2.charAt(i))
			 return false;
	    }
	  return true;
	}
   
	//create a method to create substrings using charAt() method
	public String createSubStrings(String string, int index1, int lastindex){
	   String s="";
	   for(int i=index1-1;i<lastindex;i++){
	      s+=string.charAt(i);
	   }
	 
	  return s;
	}
   
     //create a method to compare strings using built-in substring method
	
	 public  String createSubStrings2(String string, int index1, int lastindex){
	      String s=string.substring(index1-1, lastindex);
		  return s;
	 }
    public static void main(String []args){
     Scanner input = new Scanner(System.in);
	 
	  //taking input two strings variable from the user
	  System.out.println("Enter the string :");
	  String string = input.next();
	  
	  System.out.println("Enter the first index :");
	  int index1 = input.nextInt();
	  
	   
	  System.out.println("Enter the last index :");
	  int lastindex = input.nextInt();
	  
	  
	  //creating class object and calling the methods
	  CompareTwoStrings2 check = new CompareTwoStrings2();
	      String s1  = check.createSubStrings( string, index1, lastindex);
	      String s2  = check.createSubStrings2( string, index1, lastindex);
	   
	   //displaying the result
	   System.out.println("Are both equal? " + check.compareStrings(s1,s2) );
	   System.out.println("The strings are "+s1 +" " +s2);
	   
	   input.close();
	  
  }
 }