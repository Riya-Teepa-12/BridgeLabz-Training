import java.util.*;
public class CheckPositive{
   //Method to check number is positive
   public static boolean isPositive(int number){
	if(number>=0)
	   return true;
	 else
	    return false;
   }

    //Method to check number is even number

   public static boolean isEven(int number){
	if(number%2==0)
	   return true;
	 else
	    return false;
   }
  

   //Method to compare first and last number


   public static int isCompare(int number1,int number2){
	if(number1>number2)
	   return 1;
	 else if(number1<number2)
	    return -1;
	  else
	     return 0;
   }



    
   public static void main(String []args){
	Scanner input=new Scanner(System.in);
	
        //creating array and taking input from user
	int []array=new int[5];

	for(int i=0;i<5;i++){
	    System.out.println("Enter five numbers: ");
	    array[i]=input.nextInt();
	}

      // calling methods and displaying the results
	for(int i=0;i<5;i++){
	    if(isPositive(array[i])){
	       if(isEven(array[i]))
		  System.out.println(array[i]+" is positive & even");
		else
     		   System.out.println(array[i]+" is positive & odd");
	    }else
     	       System.out.println(array[i]+" is negative");		
	    	  
	}

	if(isCompare(array[0],array[4])==1)
	  System.out.println(array[0]+" is greater");
	 else if(isCompare(array[0],array[4])==-1)
	   System.out.println(array[4]+" is greater");
	  else
	    System.out.println("Both are equal");

       input.close();
     }

   }






