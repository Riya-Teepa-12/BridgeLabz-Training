import java.util.Scanner;
public class VotingEligibility{
    public static void main(String []args){
           //creating object of Scanner and taking age as input  from user
     Scanner input=new Scanner(System.in);
           int age=input.nextInt();

           //checking  whether his/her age is greater than or equal to 18.
           if(age>=18)
            System.out.println("The person's age is "+ " " +age +" " +"and can vote");
              else
                System.out.println("The person's age is "+ " " +age +" " +"and cannot vote");
           input.close();
            }
}