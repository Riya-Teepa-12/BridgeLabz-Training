// Create  MultiplicationTable Class to compute the table of any number using 
// an array
import java.util.Scanner;

class MultiplicationTable{
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // creating a variable and taking integer  input from the user
         System.out.println("Enter a number: ");
        int number= input.nextInt();

       //defining a integer array 
        int arr[] =new int[10];
       
       //taking input from the user
         for(int i=0;i<arr.length;i++){
            arr[i]=(i+1) * number;
        }

       //displaying the table
           for(int i=0;i<arr.length;i++){
             System.out.println("the result from the array in the " +  number +"*" + (i+1)+ "="+arr[i] );
           }
         
            input.close();
            System.exit(0);
      }
}
