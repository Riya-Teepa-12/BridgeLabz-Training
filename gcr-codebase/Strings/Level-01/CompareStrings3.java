import java.util.*;
 class CompareStrings3{
    
	
	 //create a method to get characters of string
	public char[]  getStrings(String s1){
	      char []ans = new char[s1.length()];
	     for(int i=0;i<s1.length();i++){
		    ans[i]=s1.charAt(i);
		 }
		return ans;
	}
   
	//create a method to get strings in a character string array using built-in methods
	public char[] getStrings1(String s1){
	     char s[]=s1.toCharArray();
	
	  return s;
	}
   
    public static void main(String []args){
     Scanner input = new Scanner(System.in);
	 
	  //taking input string variable from the user
	  System.out.println("Enter the string :");
	  String string1 = input.next();
	  
	  //creating class object and calling the methods
	  CompareStrings3 check = new CompareStrings3();
	      char ans1[] = check.getStrings(string1);
	      char ans2[] = check.getStrings1(string1);
	   
	   //displaying the result
	   boolean flag=false;
	   for(int i=0;i<ans1.length;i++){
	      if(ans1[i]==ans2[i]){
		   flag=true;
		  }
		  else{
		  flag=false;
		  }
	   }
	   if(flag)
	   System.out.println("Array are same");
	   else
	   System.out.println("Array are not same");
	   
	   input.close();
	  
  }
 }