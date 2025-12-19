// Create  OddEven Class to compute the odd and even numbers using 
// an array
import java.util.Scanner;

class  OddEven{
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);
       
       //defining a double array and taking input from the user
            System.out.println("enter the number: ");
            int number= input.nextInt();
           if(number<1){
            System.out.println("Error :  it is not a valid Number");
            System.exit(0);
          }
         //defining an integer array fro odd and even numbers
          int odd[] =new int[number/2+1]; 
           int even[] =new int[number/2+1]; 

        //creating index variable
          int oddIndex=0;
          int evenIndex=0;
         for(int i=1;i<=number;i++){
             if(i%2==0){
                even[evenIndex++]=i;
                
            }
             else{
               odd[ oddIndex++]=i;
                           }
         }

       //printing the odd and even numbers array using the odd and even index
         for(int i=0;i<evenIndex;i++){
             System.out.println(even[i]);
              }
         for(int i=0;i<oddIndex;i++){
             System.out.println(odd[i]);
              }


               input.close();
            }
      }
