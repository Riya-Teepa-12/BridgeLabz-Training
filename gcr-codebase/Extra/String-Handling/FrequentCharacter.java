import java.util.*;
public class FrequentCharacter{

   //method to find the most frequent character
     public static char findFrequentCharacter(String s){
	    int freq[] = new int[26];
	    for(int i=0;i<s.length();i++){
		      freq[s.charAt(i)-'a']++;
		  }
		  int max=0;
		  char result = s.charAt(0);
	    for(int i=0;i<26;i++){
		   if(freq[i]>max){
		      max=freq[i];
		      result= (char)('a'+i);
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
	    char ch= findFrequentCharacter(s);
		  System.out.println("The Most frequent Character is "+ ch);
	  input.close();
	  
   }
 }