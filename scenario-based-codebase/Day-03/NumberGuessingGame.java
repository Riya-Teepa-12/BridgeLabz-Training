
import java.util.*;
public class NumberGuessingGame{
  public static void main(String []args){
      //create scanner object to take input from user
       Scanner input = new Scanner(System.in);
	   int wrongCount=0;

        //using do-while loop for taking input and displaying the results
	   do{
	     System.out.println("Welcome to our Game Guess the Number :");
		 System.out.println("Guess the number between 1 to 100");
		 int guessNumber = input.nextInt();
		 int exactNumber = (int)(Math.random() * ( 98))+2;
		 if(exactNumber>guessNumber){
			 System.out.println("Too Low");
			 wrongCount++;
		 }
		 else if(guessNumber>exactNumber){
			 System.out.println("Too High");
			 wrongCount++;
		 }
		 else{
			 System.out.println("Correct Guessed congratulations !!");
		 }
	    
	   }while(wrongCount<5);
	   

      System.out.println("Thank you for playing the game ");
	  input.close();
  }
}