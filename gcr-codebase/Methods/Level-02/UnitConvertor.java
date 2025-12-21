import java.util.*;

class UnitConvertor{
   
   //creating a method to covert kilometer into mile
   public static double convertKmToMiles(double km){
     double km2miles= km* 0.621371;
	 return  km2miles;
   }
   
   //creating a method to covert miles into kilometer
   public static double convertMilesToKm(double miles){
     double miles2km= miles* 1.60934;
	 return  miles2km;
   }
   
    //creating a method to covert meters to feet
   public static double convertMetersToFeet(double meters){
     double meters2feet=  3.28084 * meters;
	 return  meters2feet;
   }
   
   //creating a method to covert  feet to meters
   public static double convertFeetToMeters(double feet){
     double feet2meters=  0.3048 * feet;
	 return  feet2meters;
   }
   
     public static void main(String []args){
   //creating object of scanner class for taking input from the user
    Scanner input= new Scanner(System.in);
	
	//taking  input from user
	System.out.println("Enter the kilometer: ");
	double km = input.nextDouble();
	System.out.println("Enter the miles: ");
	double miles = input.nextDouble();
	System.out.println("Enter the meters: ");
	double meters = input.nextDouble();
	System.out.println("Enter the feet: ");
	double feet = input.nextInt();
	 
	 //calling the methods
	 double res = convertKmToMiles(km);
	  double res1 = convertMilesToKm(miles);
	  double res2= convertMetersToFeet(meters);
	   double res3= convertFeetToMeters(feet);
	   
	  //displaying the result
	  System.out.println("Km to Miles " +res);
	  System.out.println("Miles to Km " +res1);
	  System.out.println("Meters to Feet " +res2);
	  System.out.println("Feet to meters " +res3);
	  
	   input.close();
	
	
	
   }
}