import java.util.Scanner;
public class RocketLaunch2{
    public static void main(String []args){
           //creating object of Scanner and taking counter as input  from user
     Scanner input=new Scanner(System.in);
           int counter=input.nextInt();

           //checking  condition
             for(int i=counter;i>=1;i--){
            System.out.println(i);
             
             }
          System.out.println("Rocket Launched"); 
          input.close();
       }
}