
import java.util.*;
class ParkingGateSystem{
  public static void main(String []args){
      //create scanner object to take input from user
       Scanner input = new Scanner(System.in);
	    System.out.println("Welcome to our parking Lot:");
	   System.out.println("park");
	   System.out.println("Exit");
	   System.out.println("Show Occupancy");
		 
       int parkingLot=5;
	  String s="";
       while(parkingLot>0 && !s.equalsIgnoreCase("exit")){
	 
		 
		System.out.println("Enter option what you like :");
	     s= input.nextLine();
        //System.out.println("The total availaibility "+parkingLot);
		 
	    switch(s){
		  
	        case "park":
		    System.out.println("Your space is alloted");
			parkingLot--;
			break;
			case "Exit":
			System.out.println("Thank you for visiting");
			break;
			case "Show Occupancy":
			System.out.println("The total occupancy is "+parkingLot);
			break;
		    default:
			System.out.println("Invalid input");
			break;
	        }
		 
        }
		if(parkingLot==0){
		System.out.println("The space is full!");
		}
	
	 input.close();
  }
}