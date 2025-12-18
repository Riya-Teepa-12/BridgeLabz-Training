import java.util.Scanner;
public class CheckNumber{
    public static void main(String []args){
           //creating object of Scanner and taking integer as input  from user
     Scanner input=new Scanner(System.in);
           int integer=input.nextInt();

           //checking  whether whether a number is positive, negative, or zero.

           if(integer>0)
            System.out.println("Positive");
              else if(integer<0)
                System.out.println("negative");
                  else
                     System.out.println("zero");
            input.close();

            }
}