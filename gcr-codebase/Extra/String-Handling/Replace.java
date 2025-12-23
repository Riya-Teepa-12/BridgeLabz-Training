import java.util.*;
public class Replace{

   //method to remove the specific character
     public static String checkReplace(String s, String word,String neWord){
	    String str[]= s.split(" ");
		String res = "";
	    for(int i=0;i<str.length;i++){
		   if(str[i].equals(word)){
		       res+=neWord;
		   }
		   else{
		       res+= str[i];
		   }
		   
		   if (i<str.length - 1) {
                res= res + " ";
            }
		}
	   
	  return res;
	 }
   public static void main(String []args){
      Scanner input = new Scanner(System.in);
	  
	  //taking string as input from the user
	  System.out.println("Enter the sentence");
	  String s=input.nextLine();
	  
	  System.out.println("Enter word to replace");
	  String word =input.next();
	  
	  System.out.println("Enter new word to replace");
	  String neWord =input.next();
	  
	  
	  //displaying the result and calling the method
	    String string1= checkReplace(s,word,neWord);
		  System.out.println("The string is "+ string1);
	  input.close();
	  
   }
 }