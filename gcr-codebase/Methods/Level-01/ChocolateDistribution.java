import java.util.*;
class ChocolateDistribution{
	//creating method to find the number of chocolates each child get and remaining chocolates
     public static int[] numberOfChocolatesAndRemaining(int numberOfChildren, int numberOfchocolates){
	     int arr[]=new int[2];
		 arr[0]=numberOfchocolates/numberOfChildren;
		 arr[1]=numberOfchocolates%numberOfChildren;
		 return arr;
		 
	 }
	 
   
   public static void main(String []args){
	   //creating scanner object to take input from user
      Scanner input =new Scanner(System.in);
	  
	  //taking integer as input from the user for no of childrens and chocolates
	   System.out.println("Enter the number of childrens");
       int numberOfChildren= input.nextInt();
	   
	   System.out.println("Enter the number of chocolates");
       int numberOfchocolates= input.nextInt();
	   
	  
	    //calling the method
	  int ans[] =new int[2];
	         ans = numberOfChocolatesAndRemaining(numberOfChildren, numberOfchocolates);
	  
	  
		   
	         
		
	//displaying the result
	      System.out.println("The number of chocolates each child get is "+ans[0]);
		  System.out.println("The number of remaining chocolates "+ans[1]);
	   input.close();
	   
     }
 }