import java.util.*;
class WindChillTemperature{
	//creating method to find the number of chocolates each child get and remaining chocolates
     public double calculateWindChill(double temp, double windSpeed){
	   double windChill  = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * Math.pow(windSpeed,0.16); 
       return windChill;
	 }

	 
   
   public static void main(String []args){
	   //creating scanner object to take input from user
      Scanner input =new Scanner(System.in);
	  
	  //taking integer as input from the user for temperature and windSpeed
	   System.out.println("Enter the temperature");
       double temperature= input.nextDouble();
	   
	   System.out.println("Enter the windSpeed");
       double windSpeed= input.nextDouble();
	   
	  
	    //calling the method
		   WindChillTemperature obj = new  WindChillTemperature();
	       double  ans = obj.calculateWindChill(temperature,windSpeed);
	  
	    //displaying the result
	      System.out.println("The wind chill temperature  is "+ans);
		  
	   input.close();
	   
     }
 }