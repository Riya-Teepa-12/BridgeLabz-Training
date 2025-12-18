import java.util.Scanner;
public class NumberSum{
    public static void main(String []args){
           //creating object of Scanner and taking a number  as input  from user
     Scanner input=new Scanner(System.in);
           double total=0.0;
           double number =input.nextDouble();
       
           //checking  condition  for the sum of numbers 
           while(number!=0){
                total+=number;
               number=input.nextDouble();
               
            }       
           System.out.println(total);
         input.close();
       }
}