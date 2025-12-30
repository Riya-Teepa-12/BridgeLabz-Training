import java.util.*;

  public class TemperatureLogger{
      public static void main(String []args){
	  
	    //create scanner object to take input from user
	    Scanner input = new Scanner(System.in);
		
		//creating array
	  double arr[] = new double[7];
		double max=0;
		double sum=0;
		int day=0;
		for(int i=0;i<7;i++){
		  System.out.println("Enter the temperature of day "+(i+1));
		  arr[i] = input.nextDouble();
		  
		  //calculating maximum element
		  if(arr[i]>max){
		  max=arr[i];
		  day=i+1;
		  }
		  sum+=arr[i];
		}
		
		//find average 
		double average = sum/7;
                for(int i=0;i<7;i++){
                   System.out.println("The temperature of day "+(i+1) +" "+arr[i]);
               }
		System.out.println("The maximum temperature is "+max +" On day:"+day);
		System.out.println("The average of temperatures is "+average);
		
	  }
  }