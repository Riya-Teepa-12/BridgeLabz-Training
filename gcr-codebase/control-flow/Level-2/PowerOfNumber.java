import java.util.*;
public class PowerOfNumber{
  public static void main(String []args){
       Scanner input= new Scanner(System.in);
       //taking integer input for two variables - number and power and check for positive integer

         System.out.print("Enter a number: ");
         int number= input.nextInt();
         System.out.print("Enter a power: ");
         int power= input.nextInt();
       //creating a result variable and initializing it
         int result=1;
       
       //checking the loop condition
         for(int i=1;i<=power;i++){
             result=result*number;
        }

       //displaying the result
       System.out.println("The PowerOfNumber is "+result);
       input.close();
   }
}    