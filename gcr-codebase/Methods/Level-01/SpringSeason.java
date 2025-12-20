import java.util.*;
class SpringSeason{
	//creating method to check number season is spring or not
   public  boolean checkSpringSeason(int month, int day){
       if(((month==3) && (day<32&&day>=20)) || ((month==4) && (day >= 1 && day<31))  || ((month==5) &&  (day >= 1 && day<32)) ||((month==6) && (day>=1 && day<=20)))
	   return true;
	   else
	   return false;
   }
   public static void main(String []args){
	   //creating scanner object to take input from user
      Scanner input =new Scanner(System.in);
	  
	  //taking input from the command line argument
       int month = Integer.parseInt(args[0]);
       int day = Integer.parseInt(args[1]);
	    
	  
	  //creating class object and calling method
	       SpringSeason check= new SpringSeason();
	       boolean ans= check.checkSpringSeason(month,day);
		
	//displaying the result
	  if(ans)
	  System.out.println("It is a spring season");
       else 
	    System.out.println("It is not spring season");    
	    
	   input.close();
	   
     }
 }