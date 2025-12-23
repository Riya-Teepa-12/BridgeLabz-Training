import java.util.*;

 class NullPointerExample{
        //method to generate Exception
	public static void generateException(){
	 String text = null;
	 System.out.println(text.length());
	}
	
	//method to handle null pointer exception
	public static void handleNullPointerException(){
	  String text=null;
      try{
         System.out.println(text.length()); 
      }	catch(NullPointerException e){
	  System.out.println("Error Message"+e.getMessage());
      }	  
	}
    public static void main(String []args){
	 
	  //calling method to generate exception
	  System.out.println("Generating NullPointerException");
	  try{
	  generateException();
	  }catch(NullPointerException ex){
	  //calling handling null pointer exception
	  System.out.println("Handling NullPointerException:");
	  handleNullPointerException();
	  }
	}
 }