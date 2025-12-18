import java.util.*;
public class GreatestFactor{
  public static void main(String []args){
       Scanner input= new Scanner(System.in);
       //taking integer input from the user
         System.out.print("Enter a number: ");
         int number= input.nextInt();
         
       //declaring and initializing greatestFactor to 1
         int greatestFactor = 1;

       //finding greatest factor using for loop
         for(int i=number-1;i>=1;i--){
             if(number%i==0){
               greatestFactor = i;
               break;
          }
       }
         
       //showing the result
         System.out.println("The greatest factor of" +" "+number+" "+"is:" + greatestFactor);
               input.close();
   }
}    