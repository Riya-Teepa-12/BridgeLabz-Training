import java.util.Scanner;
public class RocketLaunch{
    public static void main(String []args){
           //creating object of Scanner and taking counter as input  from user
     Scanner input=new Scanner(System.in);
           int counter=input.nextInt();

           //checking  condition
           while(counter>=1){
            System.out.println(counter);
              counter--;
             }
          System.out.println("Rocket Launched"); 
          input.close();
       }
}