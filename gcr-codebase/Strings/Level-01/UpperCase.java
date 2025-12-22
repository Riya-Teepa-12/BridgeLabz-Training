import java.util.*;
 class UpperCase{
    
	
	 //create a method to get string in uppercase
	public String toUpperCase(String string1){
	       String ans= "";
	      for(int i=0;i<string1.length();i++){
		     char ch=string1.charAt(i);
			 if(ch>=97 && ch<=122){
			    ch=(char)(string1.charAt(i)-32);  
			   ans+=ch;
			 }
			 else{
				 ans+=ch;
			 }
		  }
		return ans;
	}
   
	//creating a methods to compare strings
	public String checkToUpperCase(String string1){
	
	  return string1.toUpperCase();
	}
   
    public static void main(String []args){
     Scanner input = new Scanner(System.in);
	 
	  //taking input string variable from the user
	  System.out.println("Enter the string :");
	  String string1 = input.nextLine();
	  
	  //creating class object and calling the methods
	    UpperCase uc = new UpperCase();
	      String ans1 = uc.toUpperCase(string1);
	      String ans2 = uc.checkToUpperCase(string1);
	   System.out.println(ans1);
	   System.out.println(ans2);
	   
	   //displaying the result
	   if(ans1.equals(ans2))
	   System.out.println("Strings are same");
	   else
	   System.out.println("Strings are not same");
	   
	   input.close();
	  
  }
 }