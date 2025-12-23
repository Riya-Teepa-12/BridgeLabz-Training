import java.util.*;

class IllegalArgumentExample{
    //method to generate Exception
	public static void generateException(String s){
		 System.out.println(s.substring(4,1));
	}
	
	//method to handle String Index Out Of Bound exception
	public static void handleException(String s){
	  String m= s.substring(4,1);
      try{
         System.out.println(m); 
      }	catch(IllegalArgumentException ex){
          System.out.println("IllegalArgunmentException occur");
	  System.out.println("Error Message"+ex.getMessage());
      }	
       catch(RuntimeException ex){
          System.out.println("RuntimeException occur");
	  System.out.println("Error Message"+ex.getMessage());
     }  
	}
    public static void main(String []args){
	  Scanner input = new Scanner(System.in);
	  //taking user input from user
	  System.out.println("Enter a string");
	  String in=input.next();
	  
	  //calling the  methods
        System.out.println("Generating IllegalArgumentException:");
    try{
        generateException(in);
    }catch(IllegalArgumentException ex){
         handleException(in);
    }
	  
	}
 }