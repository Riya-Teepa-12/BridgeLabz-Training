import java.util.*;
public class MultipleOfNumbers1{
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
             //finding greatest factor using for loop
               for(int i=100;i>=1;i--){
                     if(i % number==0){
                       System.out.println(i);
                     }
                } 
            }
          input.close();
   }
}    