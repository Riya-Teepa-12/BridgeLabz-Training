// Create  CheckNumber Class to compute number is positive negative or zero as well odd even 
// an array

import java.util.Scanner;

class CheckNumber{
   public static void main(String[] args) {

      // Create a Scanner Object and  creating an integer array of 5 numbers
      Scanner input = new Scanner(System.in);
      int []num=new int[5];
     

      //taking num as input 
      for(int i=0;i<num.length;i++){
            System.out.println("Enter a number:");
               num[i]=input.nextInt();
      }
      

   //checking if number is positive,negative or zero
      for(int i=0;i<num.length;i++){
           if(num[i]<0)
              System.out.println(num[i]+" is negative");
                else if(num[i]>0){
                   if(num[i]%2==0)
                      System.out.println(num[i]+" is even");
                        else
                          System.out.println(num[i]+" is odd");
                 }
               else
                    System.out.println("zero");

      }
      

      //comparing first and last element of the array
  if(num[0]>num[4])
       System.out.println("first element is greater than last element");
  else if(num[0]<num[4])
        System.out.println("first element is less than last element");
  else
          System.out.println("first element is equal to last element");


  input.close();
  System.exit(0);

      }
}