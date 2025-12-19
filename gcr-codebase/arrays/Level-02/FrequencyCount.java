import java.util.*;
class FrequencyCount{
   public static void main(String []args){
        //creating object of scanner for taking input
          Scanner input= new Scanner(System.in);
        
       //taking a number as input from the user
         int number = input.nextInt();
          int num=number;
         int digit=0;
         while(number!=0){
           number=number/10;
           digit++;
        }
         // Create array to store digits
        int[] digits = new int[digit];

         for (int i = digit - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
          int[] frequency = new int[10];
          // Calculate frequency of each digit
          for (int i = 0; i < digit; i++) {
            frequency[digits[i]]++;
        }
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        input.close();

     }
}