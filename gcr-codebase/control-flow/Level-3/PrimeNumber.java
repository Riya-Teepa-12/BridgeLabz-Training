import java.util.*;
public class PrimeNumber{
  public static void main(String []args){
       Scanner input= new Scanner(System.in);
       //taking integer input for checking prime number

       System.out.println("Enter a number: ");
        int number= input.nextInt();

       //Checking Prime Number
       boolean isPrime=true;
       if(number<=1){
	isPrime=false;
       }
	else{
          for(int i=2;i<number;i++){
	     if(number%i==0){
	       isPrime=false;
	       break;
	     }
          }
	}
	
       if(isPrime)
  	 System.out.println(number+" is prime number");
        else
	  System.out.println(number+" is not a prime number");

       input.close();
  }
}

