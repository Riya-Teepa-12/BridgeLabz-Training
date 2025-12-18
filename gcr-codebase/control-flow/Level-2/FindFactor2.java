import java.util.*;
public class FindFactor2{
  public static void main(String []args){
       Scanner input= new Scanner(System.in);
       //taking integer input from the user
         System.out.print("Enter a number: ");
         int number= input.nextInt();
         if (number < 0) {
            System.out.println("Please enter a positive integer");
         } 
        else{
         System.out.println("Factors of " + number + " are:");
         //checking condition by using while loop
         int counter=1;
         while(counter<number){
          if(number%counter==0){
             System.out.println(counter);
             counter++;
           }
        }
      }
      input.close();
   }
}    