import java.util.*;

class UnitConvertor2{
   
   //creating a method to covert yards into feet
   public static double convertYardsToFeet(double yards){
     double yards2feet = 3 * yards;
	 return  yards2feet;
   }
   
   //creating a method to covert feet into yards
   public static double convertFeetToYards(double feet){
     double feet2yards = 0.333333 * feet ;
	 return  feet2yards;
   }
   
    //creating a method to covert meters to inches
   public static double convertMetersToInches(double meters){
     double meters2inches=  39.3701 * meters;
	 return  meters2inches;
   }
   
   //creating a method to covert  inches to meters
   public static double convertInchesToMeters(double inches){
     double inches2meters=  0.0254 * inches;
	 return  inches2meters;
   }
   
   //creating a method to covert  inches to centimeters
      public static double convertInchesToCentimeters(double inches){
     double inches2centimeters=  2.54 * inches;
	 return  inches2centimeters;
   }
   
     public static void main(String []args){
   //creating object of scanner class for taking input from the user
    Scanner input= new Scanner(System.in);
	
	//taking  input from user
	System.out.println("Enter the yards: ");
	double yards = input.nextDouble();
	System.out.println("Enter the feet: ");
	double feet = input.nextDouble();
	System.out.println("Enter the meters: ");
	double meters = input.nextDouble();
	System.out.println("Enter the inches: ");
	double inches = input.nextInt();
	
	 
	 //calling the methods
	 double res = convertYardsToFeet(yards);
	  double res1 =convertFeetToYards(feet);
	  double res2= convertMetersToInches(meters);
	   double res3= convertInchesToMeters(inches);
	    double res4= convertInchesToCentimeters(inches);
	   
	   
	  //displaying the result
	  System.out.println("Yards to Feet " +res);
	  System.out.println("Feet to Yards " +res1);
	  System.out.println("Meters to Inches " +res2);
	  System.out.println("Inches to Meters " +res3);
	  System.out.println("Inches to Centimeters " +res4);
	  
	   input.close();
	
	
	
   }
}