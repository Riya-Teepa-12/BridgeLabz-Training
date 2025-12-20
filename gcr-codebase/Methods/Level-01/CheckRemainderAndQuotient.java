import java.util.*;
class CheckRemainderAndQuotient{
	//creating method to find the remainder and quotient
     public static int[] findRemainderAndQuotient(int number, int divisor){
	     int arr[]=new int[2];
		 arr[0]=number/divisor;
		 arr[1]=number%divisor;
		 return arr;
		 
	 }
	 
   
   public static void main(String []args){
	   //creating scanner object to take input from user
      Scanner input =new Scanner(System.in);
	  
	  //taking integer as input from the user
	   System.out.println("Enter the number 1:");
       int number= input.nextInt();
	   
	   System.out.println("Enter the divisor: ");
       int number2= input.nextInt();
	   
	  
	    //calling the method
	  int ans[] =new int[2];
	         ans = findRemainderAndQuotient(number,number2);
	  
	  
		   
	         
		
	//displaying the result
	      System.out.println("The quotient is "+ans[0]);
		  System.out.println("The remainder is "+ans[1]);
	   input.close();
	   
     }
 }