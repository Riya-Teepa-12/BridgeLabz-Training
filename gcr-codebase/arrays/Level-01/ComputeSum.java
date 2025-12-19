// Create  ComputeSum  Class to compute the sum of the numbers using 
// an array
import java.util.Scanner;

class  ComputeSum{
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);
       
       //defining a integer array to store 10 numbers
        double arr[] =new double[10];
        double total=0.0;
        int index=0;
       //taking input from the user
          while(true){
                 if(index==10)
                    break;

                System.out.println("Enter a number: ");
                double number  =input.nextDouble();
                
                      if(number!=0 && number>0) 
                                arr[index]= number;
                            
                       
                         else
                            break;
                       
                   index++;
                  
               }
             for(int i=0;i<index;i++){
               total+=arr[i];
            }
           //displaying the total value
           System.out.println(total);
               input.close();
            
      }
}
