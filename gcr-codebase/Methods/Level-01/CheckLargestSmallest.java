import java.util.*;
class CheckLargestSmallest{
	//creating method to find the largest and smallest number
     public static int[] findSmallestAndLargest(int number1, int number2, int number3){
	      int arr[]= new int[2];
	       arr[0] = Math.min(number1, Math.min(number2, number3)); 
           arr[1] = Math.max(number1, Math.max(number2, number3)); 
		   
		   return arr;
		 
	 }
	 
   
   public static void main(String []args){
	   //creating scanner object to take input from user
      Scanner input =new Scanner(System.in);
	  
	  //taking input from the user 
	   System.out.println("Enter the number 1: ");
       int number1= input.nextInt();
	   
	   System.out.println("Enter the number 2: ");
       int number2= input.nextInt();
	   
	   System.out.println("Enter the number 3: ");
       int number3= input.nextInt();
	    
	  int ans[] =new int[2];
	         ans = findSmallestAndLargest(number1,number2, number3);
	  
	  
		   
	         
		
	//displaying the result
	      System.out.println("The smallest  number is "+ans[0]);
		  System.out.println("The largets  number is "+ans[1]);
	   input.close();
	   
     }
 }