import java.util.*;

class LeapYear{

    //creating a method to check year is leap year or not
	public static boolean checkLeapYear(int year){
	  if(year % 4==0){
	    if(year % 100==0){
			 return year % 400==0;
		}
	  return true;
	  }
	   return false;
	}
   
  public static void main(String []args){
   //creating object of scanner class for taking input from the user
    Scanner input= new Scanner(System.in);
	
	//taking year as input from user
	System.out.println("Enter the year: ");
	int year = input.nextInt();
	 if(year<1582){
	 System.out.println("It is not a valid year: Enter valid year greater than 1581");
	 }
	 //calling the methods
	 else{
	    boolean check= checkLeapYear(year);
	   //displaying the result
	    if(check)
		System.out.println("The year  "+ year+" is leap year" );
        else{
        System.out.println("The year  "+ year+" is not a leap year" );
		}			
	 }
	
	
   }
}