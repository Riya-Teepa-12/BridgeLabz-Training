import java.util.*;
class HandShakes{
	//creating method to calculate total number of handShakes
   public  int totalHandShakes(int number){
       int totalNumber = (number * (number - 1)) / 2;
	   return totalNumber;
   }
   public static void main(String []args){
	   //creating scanner object to take input from user
      Scanner input =new Scanner(System.in);
	  
	  //taking input from the user for the total number of students
	   System.out.println("Enter total number of students :");
       int number = input.nextInt();
	  
	  //creating class object and calling method
	   HandShakes hand = new HandShakes();
	    int handShakes = hand.totalHandShakes(number);
		
	//displaying the result
	  System.out.println("The number of possible HandShakes " +handShakes );
	   input.close();
	   
     }
 }