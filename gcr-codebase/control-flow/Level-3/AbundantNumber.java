import java.util.*;
public class AbundantNumber{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
	//taking integer input for number from the user 

        System.out.println("Enter a number:");
        int number= input.nextInt();
        int sum= 0;

        //Finding sum of the divisor
        for(int i=1;i<number;i++){
	   if(number%i==0)
	     sum+=i;
	}

       //displaying the the number is abundant or not
         if(sum>number)
          System.out.println("Abundant Number");
	     else
                System.out.println("Not a Abundant Number");

	input.close();
    }
}

