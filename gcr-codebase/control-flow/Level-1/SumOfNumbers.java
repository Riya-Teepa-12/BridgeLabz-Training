import java.util.Scanner;
public class SumOfNumbers{
    public static void main(String []args){
           //creating object of Scanner and taking number as input from user
     Scanner input=new Scanner(System.in);
           int n=input.nextInt();
          
          //the sum of n natural numbers 
          int sumOfNumber= (n * (n+1))/2;

          if(n<0){
            System.out.println("The number" +" "+ n +" " + "is not a natural number");
           }
            else
              System.out.println("The sum of"+" " +n+ " "+"natural numbers is" +" " +sumOfNumber);
        input.close(); 
    }
}