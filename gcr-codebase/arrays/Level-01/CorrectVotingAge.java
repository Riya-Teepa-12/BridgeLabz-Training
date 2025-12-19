// Create  CorrectVotingAge Class to compute the correct age for giving voting using 
// an array
import java.util.Scanner;

class CorrectVotingAge {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // declaring array and taking input from the user
         int age[] =new int[10];

         for(int i=0;i<age.length;i++){
             System.out.println("enter your age: ");
             age[i]=input.nextInt();
          }

          for(int i=0;i<age.length;i++){
              if(age[i]<0)
                   System.out.println(" an invalid age, age should be not negative");
                 
                else{
                     if(age[i]>=18)
                        System.out.println("The student with the age "+age[i]+" "+"can vote");
                        else
                            System.out.println("The student with the age "+age[i]+" "+"cannot vote");

          }
       }
         
            input.close();
            System.exit(0);
      }
}

