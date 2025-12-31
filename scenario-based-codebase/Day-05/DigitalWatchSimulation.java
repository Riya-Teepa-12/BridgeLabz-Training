
import java.util.*;
public class DigitalWatchSimulation{
   public static void main(String []args){
   
    //create scanner object to take input from user 
	Scanner input = new Scanner(System.in);

    //using for loop for printing hours and minute
    for(int i=0;i<24;i++){
	
	   for(int j=0;j<60;j++){
	   
	     System.out.println("Hours "+i +"," +" minutes "+j);
		 
		 if(i==13 && j==0){
	     System.out.println("Power cut occurred! Watch stopped.");
		 break;
		 }
		
	  }
		   
	}
     input.close();
   }
}