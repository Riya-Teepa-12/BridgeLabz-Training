import java.util.*;
class CheckNumber{
	//creating method to check number is positive, negative , or zero
   public  int checkTheNumber(int number){
       if(number<0)
	    return -1;
	   else if(number>0)
	    return 1;
	   else
	   return 0;
   }
   public static void main(String []args){
	   //creating scanner object to take input from user
      Scanner input =new Scanner(System.in);
	  
	  //taking input from the user 
	   System.out.println("Enter the number:");
       int number = input.nextInt();
	    
	  
	  //creating class object and calling method
	   CheckNumber check= new CheckNumber();
	    int ans= check.checkTheNumber(number);
		
	//displaying the result
	  if(ans>0)
	  System.out.println("The number is positive");
       else if(ans<0)
	    System.out.println("The number is negative");    
	    else
			 System.out.println("The number is zero");
	    
	   input.close();
	   
     }
 }