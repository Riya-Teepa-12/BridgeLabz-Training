import java.util.*;

public class NumberFormatExceptionDemo{

   // method to generate Number format exception
   public static void generateException(String str){
      int s=Integer.parseInt(str);
   }
   
   //handling NumberFormatException
   public static void handlingException(String str){
     try{
	     int s= Integer.parseInt(str);
	  }catch(NumberFormatException ex){
	    System.out.println("NumberFormatException error:");
		 System.out.println("Error Message:"+ex.getMessage());
	  }
   }
   
   public static void main(String []args){
      //taking input from the user
	  Scanner input = new Scanner(System.in);
	  String str=input.next();
	  
	  //calling method
	  System.out.println("Generating NumberFormatException:");
	  try{
	    generateException(str);
	  }catch(NumberFormatException ex){
	     handlingException(str);
	  }
	  input.close();
   }
}