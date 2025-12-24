import java.time.LocalDate;
import java.util.*;

public class DateArithmetic{

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);

		// take date input from user
		System.out.println("Enter date (yyyy-mm-dd):");
		String dateInput=input.nextLine();

		LocalDate dateLoc=LocalDate.parse(dateInput);

		// adding 7 days, 1 month, and 2 years
		LocalDate dateUpdate=dateLoc.plusDays(7).plusMonths(1).plusYears(2);

		// subtracting 3 weeks
		LocalDate dateFinal=dateUpdate.minusWeeks(3);

		System.out.println("Original Date: "+dateLoc);
		System.out.println("After adding 7 days, 1 month, and 2 years: "+dateUpdate);
		System.out.println("After subtracting 3 weeks: "+dateFinal);

		input.close();
	}
}