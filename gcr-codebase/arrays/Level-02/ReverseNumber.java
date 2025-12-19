import java.util.*;
class ReverseNumber{
  public static void main(String []args){
        Scanner input= new Scanner(System.in);
          
        //taking input from the user
        System.out.println("Enter a number :");
        int number= input.nextInt();
         int num=number;
         int count=0;
        while(number!=0){
            number=number/10;
              count++; 
           }
       // Create array to store digits
        int[] digits = new int[count];

         for (int i = count-1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
          //Creating a reverse array
        int[] reverseDigits = new int[count];

        for (int i = 0; i < count; i++) {
            reverseDigits[i] = digits[count - 1 - i];
        }
       for(int i=0;i<=count-1;i++){
           System.out.print( reverseDigits[i]);
         }
      input.close();
    }
}