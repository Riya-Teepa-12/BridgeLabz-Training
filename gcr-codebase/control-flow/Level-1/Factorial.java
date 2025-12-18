import java.util.Scanner;
public class Factorial{
    public static void main(String []args){
           //creating object of Scanner and taking numbers as input  from user
          Scanner input=new Scanner(System.in);
           int number=input.nextInt();
            long fac = 1;
           if (number < 0) {
            System.out.println("Please enter a positive integer");
        } else {
           
            int i = 1;

            // Computing factorial using while loop
            while(i<=number){
                  fac=fac*i;
                   i++;
             }
                                
           }
         //displaying the output of the factorial
        System.out.println("The factorial of"+ " " +number +" is"+" " +fac);  
          input.close();
         }
}