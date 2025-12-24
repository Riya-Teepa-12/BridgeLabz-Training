import java.util.Scanner;

public class GuessTheNumber{

	

	// generating the random number
	public static int generateRandomNumber(){
		
		int num=(int)(Math.random()*98)+2;
		System.out.println("random number "+num);
		return num;
	}

	
	//method to guess the output
	public static void checkGuess(int t1,int t2){
		if(t2>t1)
		System.out.println("Guess is low");
		else if(t1>t2)
		System.out.println("Guess is high");
		else
		System.out.println("Guess is correct");
		
	}
	// taking  input from the user
	public static int takeInput(){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		return input.nextInt();
	}

	public static void main(String[] args){

		//calling the method
		
		int t1=takeInput();
		int t2=generateRandomNumber();
		checkGuess(t1,t2);
			
	}
}