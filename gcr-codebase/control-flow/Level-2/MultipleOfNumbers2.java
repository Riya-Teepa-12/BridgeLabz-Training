import java.util.*;
public class MultipleOfNumbers2{
  public static void main(String []args){
       Scanner input= new Scanner(System.in);
       //taking integer input from the user
         System.out.print("Enter a number: ");
         int number= input.nextInt();
         
       //checking the number is a positive integer and less than 100.

         if(number<=0 || number>=100){
           System.out.println("Please input a positive integer less than 100");
        }
          else{
              System.out.println("Multiples of " + number + " below 100 are:");
             //finding greatest factor using while loop
              // Create counter variable
                   int i=100;
                while (i>=1) {
                     if (i % number == 0) {
                    System.out.println(i);
                    }
                i--;
                            
               }

          }
          input.close();
   }
}