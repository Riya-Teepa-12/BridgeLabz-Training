
import java.util.*;
class SimpleInterest{
	//creating method to calculate simple Interest
   public  double calculateSimpleInterest(double principal, double rate, double time){
       double simpleInterest= (principal * rate * time)/100;
	   return simpleInterest;
   }
   public static void main(String []args){
	   //creating scanner object to take input from user
      Scanner input =new Scanner(System.in);
	  
	  //taking input from the user for principle, rate, and time
	   System.out.println("Enter principal :");
	   double principal=input.nextDouble();
	    System.out.println("Enter Rate :");
	   double rate= input.nextDouble();
	     System.out.println("Enter Time :");
	   double time= input.nextDouble();
	    SimpleInterest sI= new SimpleInterest();
		  double res=sI. calculateSimpleInterest(principal,rate,time);
		  
		//displaying the simpleInterest
	   System.out.println("The Simple Interest is "+res+" "+"for Principal " +principal+","+"Rate Of Interest "+" "+rate+" "+"and Time "+" "+time);
	   
	   input.close();
	   
     }
 }