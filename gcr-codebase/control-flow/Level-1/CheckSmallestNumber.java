import java.util.Scanner;
public class CheckSmallestNumber{
    public static void main(String []args){
           //creating object of Scanner and taking numbers as input  from user
     Scanner input=new Scanner(System.in);
           int number1=input.nextInt();
           int number2=input.nextInt();
           int number3=input.nextInt();
         
         String out=""; 
         //checking if the first is the smallest of the 3 numbers
             if(number1<number2 && number1<number3)
                  out="YES";
              else
                  out="NO";

         //displaying output
       System.out.println("Is the first number the smallest?" +" "+out+" ");
       input.close();
  }
}