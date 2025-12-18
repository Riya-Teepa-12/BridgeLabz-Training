import java.util.Scanner;
class LargestNumber{
    public static void main(String []args){
           //creating object of Scanner and taking numbers as input from the user
       Scanner input=new Scanner(System.in);
           int number1=input.nextInt();
           int number2=input.nextInt();
           int number3=input.nextInt();
     
         String out1="";
         String out2="";
         String out3="";
        //Checking which number is largest among three numbers
           if (number1 > number2 && number1 > number3)
            out1 = "YES";
             else
               out1 = "NO";

        if (number2 > number1 && number2 > number3)
            out2 = "YES";
             else
                out2 = "NO";

        if (number3 > number1 && number3 > number2)
            out3 = "YES";
             else
               out3 = "NO";
        // displaying the output
        System.out.println("Is the first number the largest? " +out1);
        System.out.println("Is the second number the largest? " + out2);
        System.out.println("Is the third number the largest? " +out3);
     }
}
