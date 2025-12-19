// class FizzBuzz is used tocheck the number is positive or not and printing statement //according to it 
import java.util.*;
class FizzBuzz{
  public static void main(String [] args){
     //creating object of scanner for taking input from user
      Scanner input= new Scanner(System.in);


     //taking a number as user input
      System.out.println("Enter the number: ");
      int number = input.nextInt();
      

      //check for positive number
       if(number<=0){
       System.out.println("Please enter a positive integer.");
         }
       else{
         String result[]= new String[number+1];
         for(int i=0;i<=number;i++){
           if(i % 3 == 0 && i % 5==0)
            result[i]="FizzBuzz";
            else if(i % 5 == 0)
             result[i]="Buzz";
             else if(i % 3 ==0)
              result[i]="Fizz";
               else
                result[i]=String.valueOf(i);
                       

       }
  
     
     //displaying the result
      for (int i = 1; i <=number; i++) {
                System.out.println("Position " + (i) + " = " + result[i]);
            }
        }

      input.close();
    
   }
}