import java.util.*;
public class PowerOfNumber2{
  public static void main(String []args){
       Scanner input= new Scanner(System.in);
       //taking integer input for two variables - number and power and check for positive integer

         System.out.print("Enter a number: ");
         int number= input.nextInt();
         System.out.print("Enter a power: ");
         int power= input.nextInt();
         if (power < 0) {
            System.out.println("Please enter a positive power value.");
        } 
       //creating a result variable and initializing it
         
       else{
            int result=1;
            int counter = 1;

            // Calculating power using while loop
              while (counter <= power) {
                result = result * number;
                counter++;
            }

         
       //displaying the result
       System.out.println("The PowerOfNumber is "+result);
         }
       input.close();
   }
}    