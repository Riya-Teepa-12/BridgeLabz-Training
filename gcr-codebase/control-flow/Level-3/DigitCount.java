import java.util.*;
public class DigitCount{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
	//taking integer input for number

        System.out.println("Enter a number:");
        int number= input.nextInt();
        int count= 0;

        // Count digits
        int temp= number;
        while(temp>0) {
            temp/= 10;
	    count++;
        }

        System.out.println(number+" has "+count+" digits.");

	input.close();
    }
}

