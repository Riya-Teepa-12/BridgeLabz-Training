import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
	//taking integer input for number
        System.out.println("Enter a number:");
        int number= input.nextInt();

        int original= number;
        int digits= 0;
        int sum= 0;

        // Count no of the digits
        int temp= number;
        while(temp>0) {
            digits++;
            temp/= 10;
        }

        // Calculating  Armstronsum
        temp= number;
        while(temp>0) {
            int digit= temp % 10;
            sum+= Math.pow(digit, digits);
            temp/= 10;
        }
        if(sum==original)
            System.out.println(original+" is an Armstrong number");
        else
            System.out.println(original+" is not an Armstrong number");

        input.close();
    }
}
