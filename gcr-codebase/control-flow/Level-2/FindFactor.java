import java.util.*;
public class FindFactor{
  public static void main(String []args){
       Scanner input= new Scanner(System.in);
       //taking integer input from the user
         System.out.print("Enter a number: ");
         int number= input.nextInt();
         if (number < 0) {
            System.out.println("Please enter a positive integer");
         } 
        else{
       //checking condition by using for loop
        System.out.println("Factors of " + number + " are:");
        for(int i=1;i<number;i++){
          if(number%i==0){
             System.out.println(i);
           }
        }
      }
      input.close();
   }
}    