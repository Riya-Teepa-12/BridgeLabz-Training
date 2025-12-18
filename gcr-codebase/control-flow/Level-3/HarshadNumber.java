import java.util.*;
public class HarshadNumber{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
	//taking integer input for number from user
        System.out.println("Enter a number:");
        int number= input.nextInt();
	int sum=0;

        //Finding the overall sum
        int temp= number;
        while(temp>0) {
	    sum+=temp%10;
            temp/= 10;
	 }
	if(number%sum==0)
          System.out.println("Harshad Number");
	 else
           System.out.println("Not a Harshad Number");

	input.close();
    }
}

