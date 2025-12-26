import java.util.*;
class CheckDivisibility{
   public static void main(String []args){
       //to check if a number is divisible by 5
     
       Scanner input=new Scanner(System.in);
       //taking number as input from the user
       int number=input.nextInt();
       //storing result
       Boolean flag=false;
       //checking if the number is divisible by 5 or not
       if(number%5==0){
          flag=true;
         } 
       //displaying the output
      System.out.println("Is the number" + " " +number+" " + "divisible by 5?" +" " +flag+ " ");
        input.close();
     }
}