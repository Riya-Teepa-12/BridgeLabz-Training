
import java.util.*;

public class FestivalLuckyDraw{
   public static void main(String []args){
   
     //create scanner object to take input from user
     Scanner input = new Scanner(System.in);
	 System.out.println("Do you want to play the game? Type Y(yes) or N(No)");
	 char choice = input.next().charAt(0);
	 
	 //using while loop to take multiple user input
	 while(choice=='Y'){
	    System.out.println("Draw the number and input which number you got");
		int number = input.nextInt();
		if(number % 3==0 && number % 5==0){
		  System.out.println("Congratulations !! you won a gift");
		}
		else{
		  System.out.println("Ohh ! you missed it");
		}
		System.out.println("Another person want to play or you want to play again ? ");
		choice = input.next().charAt(0);
	   
	 }
	 System.out.println("Thank you");
	 input.close();
   }
}