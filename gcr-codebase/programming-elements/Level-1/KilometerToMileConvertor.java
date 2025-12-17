import java.util.*;
class KilometerToMileConvertor{
   public static void main(String []args){
      //declaring a variable km
      double km;
      //creating Scanner object
      Scanner input = new Scanner(System.in);
      km=input.nextDouble();
      //converting kilometers into miles
      double totalMiles= km*0.625;
      // displaying the total miles from the given kilometers
      System.out.println("The total miles is"+ totalMiles + "mile for the given" + km +"km");
      
   }
}