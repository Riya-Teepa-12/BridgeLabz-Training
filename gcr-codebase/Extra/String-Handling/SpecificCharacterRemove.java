import java.util.*;
public class SpecificCharacterRemove{

   //method to remove the specific character
     public static String removeSpecificCharacter(String s, char ch){
	    String str="";
	    for(int i=0;i<s.length();i++){
		   if(s.charAt(i)!=ch)
		   str+=s.charAt(i);
		}
	   
	  return str;
	 }
   public static void main(String []args){
      Scanner input = new Scanner(System.in);
	  
	  //taking string as input from the user
	  System.out.println("Enter the string");
	  String s=input.nextLine();
	  
	  System.out.println("Enter the character");
	  char word = input.next().charAt(0);
	  
	  
	  //displaying the result and calling the method
	    String string1= removeSpecificCharacter(s,word);
		  System.out.println("The string is "+ string1);
	  input.close();
	  
   }
 }