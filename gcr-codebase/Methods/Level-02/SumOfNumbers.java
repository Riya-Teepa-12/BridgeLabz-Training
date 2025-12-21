import java.util.*;

class SumOfNumbers{


   //creating a method to show the sum of the n numbers 
   public static int sumRecursion(int number){
   
   if(number==0)
	   return 0;
   else
	 return number+sumRecursion(number-1);
   }
   
    //creating a method to show the sum of the n numbers using formula
	public static int sumOfNumbers(int number){
	int sum=0;
	sum=((number) * (number+1)/2);
	return sum;
	}
   
  public static void main(String []args){
   //creating object of scanner class for taking input from the user
    Scanner input= new Scanner(System.in);
	
	//taking integer as input from user
	System.out.println("Enter the number: ");
	int number = input.nextInt();
	 if(number<1){
	 System.out.println("It is not a natural number: Enter natural number");
	 }
	 //calling the methods
	 else{
	    int total= sumRecursion(number);
		int total1=sumOfNumbers(number);
		
		//displaying the result
		System.out.println("The sum of "+number+ " using Recursion is "+total);
		System.out.println("The sum of "+number+ " using formula is "+total1);
	 }
	
	
   }
}