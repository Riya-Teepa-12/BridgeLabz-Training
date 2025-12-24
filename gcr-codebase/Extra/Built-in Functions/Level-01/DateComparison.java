import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison{

	public static void main(String[] args) {

        //create scanner class object and taking input from u
		Scanner input=new Scanner(System.in);

		System.out.println("Enter first date (yyyy-mm-dd):");
		LocalDate d1=LocalDate.parse(input.nextLine());

		System.out.println("Enter second date (yyyy-mm-dd):");
		LocalDate d2=LocalDate.parse(input.nextLine());

        //apply condition and display the result
		if(d1.isBefore(d2)){
			System.out.println("First date is before the second date");
		}
		else if(d1.isAfter(d2)){
			System.out.println("First date is after the second date");
		}
		else if(d1.isEqual(d2)){
			System.out.println("Both dates are the same");
		}

		input.close();
	}
}