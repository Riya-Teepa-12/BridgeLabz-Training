import java.util.*;
public class GreatestFactor2{
  public static void main(String []args){
       Scanner input= new Scanner(System.in);
       //taking integer input from the user
         System.out.print("Enter a number: ");
         int number= input.nextInt();
         
       //declaring and initializing greatestFactor to 1
         int greatestFactor = 1;
         int counter = number-1;
       //finding greatest factor using while loop
         while(counter>=1){
              if(number % counter ==0){
                greatestFactor = counter;
                break;
            }
         counter--; 
       }         
        //showing the result
         System.out.println("The greatest factor of" +" "+number+" "+"is:" + greatestFactor);
               input.close();
   }
}    