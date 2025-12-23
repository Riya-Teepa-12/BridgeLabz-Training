import java.util.*;

 class StringIndexOutOfExample{
    //method to generate Exception
	public static void generateException(String s){
	 int length = s.length();
         System.out.println(s.charAt(length));
	   	}
	
	//method to handle String Index Out Of Bound exception
	public static void handleException(String s){
	 
      try{
         int length = s.length();
         System.out.println(s.charAt(length)); 
      }	catch(StringIndexOutOfBoundsException e){
          System.out.println("StringIndexoutofBoundsException caught");
	  System.out.println("Error Message"+e.getMessage());
      }	  
	}
    public static void main(String []args){
	  Scanner input = new Scanner(System.in);
	  //taking user input from user
	  System.out.println("Enter a string");
	  String in=input.next();
	  
	  //calling the  methods
        System.out.println("Generating Exception:");
    try{
        generateException(in);
    }catch(StringIndexOutOfBoundsException ex){
        handleException(in);
    }

   input.close();
	  
	}
 }