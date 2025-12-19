// Create   MultiplicationTable2 Class to compute the table  using 
// an array
import java.util.Scanner;

class  MultiplicationTable2{
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);
       
       //defining a integer array and taking input from the user
           int multiplicationResult[] =new int[4];
           System.out.println("Enter a number : ");
           int index= input.nextInt();
           
           int n=0;
       //using for loop for printing table
           for(int i=6;i<=9;i++){
             multiplicationResult[n++]= index * i;
           }
       //displaying the result
            int j=0; 
            for(int i=6;i<=9;i++){
             System.out.println("The multiplication is of "+index + "*" + i+"="+ multiplicationResult[j++]);
          }

            
               input.close();
            }
      }
