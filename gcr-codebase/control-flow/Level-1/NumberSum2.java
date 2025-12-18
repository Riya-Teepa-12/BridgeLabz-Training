import java.util.Scanner;
public class NumberSum2{
    public static void main(String []args){
           //creating object of Scanner and taking a number  as input  from user
     Scanner input=new Scanner(System.in);
           double total=0.0;
           double number =input.nextDouble();
       
           //checking  condition  for the sum of numbers 
           while(true){
                total+=number;
               number=input.nextDouble();
               if(number<=0)
               break; 
            }       
           System.out.println(total);
           input.close();
       }
}