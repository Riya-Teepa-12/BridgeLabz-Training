import java.util.*;

public class PrimeNumber{

	// method to check prime number
	public static boolean checkPrime(int number){
		
		if(number<=1)
		return false;
		else if(number==2)
		return true;
		else if(number%2==0)
		return false;
		for(int i=3;i*i<=number;i+=2){
		if(number%i==0)
		return false;
		}
		return true;
	}
	
	//method to take input from the user
	public static int takeInput(){
		
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter number");
		int number=kb.nextInt();
		
		return number;
	}
	// method to display maximum number
	public static void displayOutput(boolean flag){	
		if(flag)
		System.out.println("It is a prime number");
		else
		System.out.println("It is not a prime number");
		
	}

	public static void main(String[]args){
	
	// calling the method 
	
	int n=takeInput();
	boolean flag=checkPrime(n);
	displayOutput(flag);
	}
	
}