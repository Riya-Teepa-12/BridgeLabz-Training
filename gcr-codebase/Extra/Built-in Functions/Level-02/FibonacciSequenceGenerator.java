 import java.util.*;
 public class FibonacciSequenceGenerator{
   
   //generate and print the fibonnaci 
     public static void generateFibonacci(int num){
	    int a=0;
		int b=1;
		int sum=0;
		for(int i=0;i<num;i++){
		System.out.print(a + " ");
		 sum= a+b;
		  a=b;
		  b= sum;
		 
		}
	}
	
	//method to take the input
    public static int takeInput(){
	   Scanner input = new Scanner(System.in);
	   System.out.println("Enter a number : ");
	   int number = input.nextInt();
	   return number;
	}
   public static void main(String []args){
      
	//calling the method
	  int str= takeInput();
	  generateFibonacci(str);
	 
   }
 }