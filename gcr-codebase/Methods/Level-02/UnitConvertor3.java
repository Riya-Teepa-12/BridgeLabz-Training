import java.util.*;

class UnitConvertor3{
   
   //creating a method to covert Farhenheit to Celcius
   public static double convertFarhenheitToCelsius(double farhenheit){
     double farhenheit2celsius = (farhenheit - 32) * 5 / 9;

	 return  farhenheit2celsius;
   }
   
   //creating a method to covert Celcius into Farhenheit
   public static double convertCelsiusToFarhenheit(double celsius){
     double celsius2farhenheit= (celsius * 9 / 5) + 32 ;
	 return  celsius2farhenheit;
   }
   
    //creating a method to covert pounds to kilograms
   public static double convertPoundToKilograms(double pounds){
     double pounds2kilograms = 0.453592 * pounds;
	 return pounds2kilograms;

   }
   
   //creating a method to covert kilograms to pounds
   public static double convertKilogramsToPounds(double kilograms){
     double kilograms2pounds = 2.20462 * kilograms; 
	 return kilograms2pounds;
   }
   
   //creating a method to covert  gallons to liters
      public static double convertGallonsToLiters(double gallons){
       double gallons2liters = 3.78541 * gallons; 
	   return gallons2liters;
   }
   
   //creating a method to covert  liters to gallons
      public static double convertLitersToGallons(double liters){
       double liters2gallons = 0.264172 * liters; 
	   return liters2gallons;

   }
   
     public static void main(String []args){
   //creating object of scanner class for taking input from the user
    Scanner input= new Scanner(System.in);
	
	//taking  input from user
	System.out.println("Enter the farhenheit: ");
	double farhenheit = input.nextDouble();
	System.out.println("Enter the celcius: ");
	double celsius = input.nextDouble();
	System.out.println("Enter the pounds: ");
	double pounds = input.nextDouble();
	System.out.println("Enter the kilograms: ");
	double kilograms = input.nextDouble();
	System.out.println("Enter the gallons: ");
	double gallons = input.nextDouble();
    System.out.println("Enter the liters: ");
	double liters = input.nextDouble();
	
	 
	 //calling the methods
	 double res = convertFarhenheitToCelsius(farhenheit);
	  double res1 =convertCelsiusToFarhenheit(celsius);
	  double res2= convertPoundToKilograms(pounds);
	   double res3= convertKilogramsToPounds(kilograms);
	    double res4= convertGallonsToLiters(gallons);
		double res5= convertLitersToGallons(liters);
		
	   
	   
	  //displaying the result
	  System.out.println("Farhenheit to celcius " +res);
	  System.out.println("Celcius to Farhenheit " +res1);
	  System.out.println("Pounds to Kilograms " +res2);
	  System.out.println("Kilograms to Pounds " +res3);
	  System.out.println("Gallons to liters " +res4);
	  System.out.println("liters to Gallons " +res5);
	  
	   input.close();
	
	
	
   }
}