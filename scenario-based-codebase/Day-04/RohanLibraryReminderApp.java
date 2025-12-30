
import java.util.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class RohanLibraryReminderApp{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int finePerDay = 5;

        // Loop for 5 books
        for (int i = 1; i <= 5; i++) {
            System.out.println("\nBook " + i);

            System.out.print("Enter due date (yyyy-mm-dd): ");
            LocalDate dueDate = LocalDate.parse(input.next());

            System.out.print("Enter return date (yyyy-mm-dd): ");
            LocalDate returnDate = LocalDate.parse(input.next());

            // Calculate delay
            long daysLate = ChronoUnit.DAYS.between(dueDate, returnDate);

            if (daysLate > 0) {
                long fine = daysLate * finePerDay;
                System.out.println("Late by " + daysLate + " days");
                System.out.println("Fine: ₹" + fine);
            } else {
                System.out.println("Returned on time. No fine");
            }
        }

        input.close();
    
    }
}

