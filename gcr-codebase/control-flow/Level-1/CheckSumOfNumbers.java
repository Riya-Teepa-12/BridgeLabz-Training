import java.util.Scanner;
 public class CheckSumOfNumbers{
    public static void main(String []args){
           //creating object of Scanner and taking a number  as input  from user
       Scanner input=new Scanner(System.in);
           int number =input.nextInt();
           int n=number;
           int sum=0;
           int sum1=0;

           //checking  condition  for the sum of numbers 
           if(number<=0){
             System.out.println("The number should be a natural number");
            }

           else{
                 while(number!=0){
                       sum1+=number;
                       number--;
                   }
           }
           sum=(n * (n+1))/2 ;
          //displaying result from the calculation
             System.out.println("Sum by using the sum of n terms formula"+sum);
             System.out.println("Sum by using while loop "+sum1);
         input.close();
                  }
}