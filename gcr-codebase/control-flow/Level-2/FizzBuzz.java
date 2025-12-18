import java.util.*;
public class FizzBuzz{
    public static void main(String []args){
      // creating object of scanner for taking input from user
       Scanner input=new Scanner(System.in);
      //taking integer as input from the user
       int number=input.nextInt();

        if (number < 0) {
            System.out.println("Please enter a positive integer");
        } 

        //checking condition using while loop and printing according to it 
       else{
          
             for(int i=0;i<=number;i++){
              if(i%5==0 && i%3==0){
                System.out.println("FizzBuzz");
                }
               else if(i%5==0){
                System.out.println("Buzz");
               } 
               else if(i%3==0){
                System.out.println("Fizz");
                 }
               
              else{
                System.out.println(i);
              }
              
           }
        }
     input.close();
    }
}