import java.util.Scanner;

public class SandeepFitnessChallenge{
   public static void main(String []args){
   
    //create scanner object for taking input from the user
       Scanner input = new Scanner(System.in);
	   
	   //create array to take input of each day push up count
         int arr[] = new int[7];
		 
	   for(int i=0;i<7;i++){
	     System.out.println("Enter the push-up count of day "+(i+1));
		    arr[i]=input.nextInt();
			if(arr[i]==0)
			continue;
	   }
	     int total=0;
	     int average=0;
	   //using for each loop to calculate total value
	   for(int x:arr){
	     total+=x;
	   }
	   
	   average = total/7;
	   //dispalying the result
	  for(int i =0;i<7;i++){
	   System.out.println("The push-up count of day "+(i+1)+" is "+arr[i]);
	  }
	  System.out.println("The total count for a week is "+total); 
	  System.out.println("The  average of count for a week is "+average); 
		 
	  input.close(); 
   }
    
}