import java.util.*;
class SumOfNumbers{
	//creating method calculate the sum of the number
   public  int sumOfNumber(int number){
      int sum=0;
      for(int i=0;i<=number;i++){
	    sum+=i;
	  }
	 return sum; 
   }
   public static void main(String []args){
	   //creating scanner object to take input from user
      Scanner input =new Scanner(System.in);
	  
	  //taking input from the user 
	   System.out.println("Enter the number");
       int number= input.nextInt();
	    
	  
	  //creating class object and calling method
	       SumOfNumbers check= new SumOfNumbers();
	         int ans= check.sumOfNumber(number);
		
	//displaying the result
	      System.out.println("The sum of the n numbers is "+ans);
	   input.close();
	   
     }
 }