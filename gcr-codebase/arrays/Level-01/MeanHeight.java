// Create  MeanHeight Class to compute the mean height of the players  using 
// an array
import java.util.Scanner;

class  MeanHeight{
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);
       
       //defining a double array and taking input from the user
            System.out.println("enter height of 11 players ");
            double arr[]= new double[11];
       
            double sum=0;
         for(int i=0;i<arr.length;i++){
             arr[i]=input.nextDouble();
         }

       //performing the sum
         for(int i=0;i<arr.length;i++){
            sum+=arr[i];	
         }
         //displaying the mean height of the football team
        System.out.println("The mean height of the football team "+sum/11);



               input.close();
            }
      }
