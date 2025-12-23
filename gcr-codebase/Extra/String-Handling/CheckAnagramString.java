import java.util.*;
public class CheckAnagramString{

     //program to check number is anagram or not
     public static boolean checkAnagram(String s1, String s2){
	    if(s1.length()!=s2.length()){
		return false;
		}
		int arr[] = new int[26];
		for(int i=0;i<s1.length();i++){
		    arr[s1.charAt(i)-'a']++;
		}
		for(int i=0;i<s2.length();i++){
		    arr[s2.charAt(i)-'a']--;
		}
		for(int i=0;i<arr.length;i++){
		     if(arr[i]!=0)
				 return false;
			 
		}
	    return true;
	 }
   public static void main(String []args){
      Scanner input = new Scanner(System.in);
	  
	  //taking string as input from the user
	  System.out.println("Enter the string1 :");
	  String s1=input.next();
	  
	  System.out.println("Enter the string2 :");
	  String s2=input.next();
	  
	  
	  //displaying the result and calling the method
	     boolean flag= checkAnagram(s1,s2);
		if(flag)
		System.out.println("The string is anagram");
		else
		System.out.println("The string is not anagram");
	    input.close();
		
	  
   }
 }