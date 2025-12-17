import java.util.*;
class Calculator{
  public static void main(String []args){
     Scanner kb=new Scanner(System.in);
    
     //Taking two numbers as input from the user
     float number1= kb.nextFloat();
     float number2= kb.nextFloat();
     
     // Performing Arithmetic Operations of addition, subtraction, multiplication and division
     float addition = number1 + number2;
     float subtraction =number1 - number2;
     float  multiplication=number1 * number2;
     float   division= number1/number2;
   
   //displaying the Operations of addition, subtraction, multiplication and division\
     System.out.println("The addition, subtraction, multiplication and division value of 2 numbers" + number1 + "and" + number2 + "is" + addition + "," + subtraction + "," + multiplication +"," + division);


   }
}