import java.util.*;
class AthleteRound{
	//creating method to calculate total number of handShakes
   public  int totalRounds(int side1, int side2, int side3){
       int perimeter = side1+ side2 + side3;
	   int rounds=5000/perimeter;
	   return rounds;
   }
   public static void main(String []args){
	   //creating scanner object to take input from user
      Scanner input =new Scanner(System.in);
	  
	  //taking input from the user for the sides of triangle
	   System.out.println("Enter sides of triangle one by one in meters:");
       int side1 = input.nextInt();
	    int side2 = input.nextInt();
		 int side3 = input.nextInt();
	  
	  //creating class object and calling method
	    AthleteRound round= new AthleteRound();
	    int rounds = round.totalRounds(side1, side2, side3);
		
	//displaying the result
	  System.out.println("The number of possible Rounds " +rounds );
	   input.close();
	   
     }
 }