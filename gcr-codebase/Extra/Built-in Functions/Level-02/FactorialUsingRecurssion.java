 import java.util.*;
 public class FactorialUsingRecurssion{
   
   //method to display the result
   
      public static void displayOutput(int s){
	   System.out.println("The factorial is "+s);
    }
   
   //method to check factorial
     public static int findFactorial(int num){
	  if (num < 0) {
         return -1;
		 }
      if(num==0 || num==1){
	  return 1;
	  }
	  return num*findFactorial(num-1);
		
	}
	
	//method to take the input
    public static int takeInput(){
	   Scanner input = new Scanner(System.in);
	   System.out.println("Enter a number : ");
	   int number = input.nextInt();
	   input.close();
	   return number;
	}
   public static void main(String []args){
      
	//calling the method
	  int str= takeInput();
	  int result = findFactorial(str);
	    if (result == -1) {
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            displayOutput(result);
        }
	   
	 
   }
 }