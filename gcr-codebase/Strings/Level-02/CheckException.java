import java.util.*;
 class CheckException{
    
	//user-defined method to find length without using length()
	public static int findTheLength(String str){
	  int count=0;
	  try{
	     while(true){
		   str.charAt(count);
		   count++;
		 }
	   } catch(Exception e){
	      return count;
	   }
	}
 
    public static void main(String []args){
      Scanner input= new Scanner(System.in);
	  
	  //take user defined method
	  String s= input.next();
	  
	  //calling user-defined method
	  int cmd = findTheLength(s);
	  int builtLength = s.length();
	  
	  //display results
	  System.out.println("Length using user-defined method"+cmd);
	   System.out.println("Length using built-in length() method"+cmd);
	   input.close();
    }
 }