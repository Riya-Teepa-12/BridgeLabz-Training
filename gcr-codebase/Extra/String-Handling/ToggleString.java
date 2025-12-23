import java.util.*;
public class ToggleString{

   //method to convert the string into toggle string
     public static String  toggleTheString(String s){
	   StringBuilder string = new StringBuilder();
	    for(int i=0;i<s.length();i++){
		  if(s.charAt(i)>='a' && s.charAt(i)<='z')
		        string.append((char)(s.charAt(i)-32));
		  
		  else
		       string.append((char)(s.charAt(i)+32));
		  
		  
		}
	     
	   
	  return string.toString();
	 }
   public static void main(String []args){
      Scanner input = new Scanner(System.in);
	  
	  //taking string as input from the user
	  System.out.println("Enter the string");
	  String s=input.next();
	  
	  //displaying the result and calling the method
	    String string1= toggleTheString(s);
		  System.out.println("The Toggled string is "+ string1);
	  input.close();
	  
   }
 }