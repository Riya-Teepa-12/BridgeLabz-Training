
import java.util.Scanner;
 
public class MovieTicketBookingApp{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int customerChoice = 1;

        while (customerChoice == 1) {

            int ticketPrice = 0;

            // Movie selection
			
            System.out.println("\nSelect Movie Type:");
            System.out.println("1. Action");
            System.out.println("2. Comedy");
            System.out.println("3. Drama");
            int movieType = input.nextInt();

            switch (movieType) {
                case 1:
                    ticketPrice = 200;
                    break;
                case 2:
                    ticketPrice = 180;
                    break;
                case 3:
                    ticketPrice = 150;
                    break;
                default:
                    System.out.println("Invalid movie type");
                    continue;
            }

            
            System.out.println("Select Seat Type (gold/silver):");
            String seatType = input.next();

            if (seatType.equalsIgnoreCase("gold")) {
                ticketPrice += 100;
            } else if (seatType.equalsIgnoreCase("silver")) {
                ticketPrice += 50;
            } else {
                System.out.println("Invalid seat type");
                continue;
            }

            // Snacks option
            System.out.println("Do you want snacks? (yes/no)");
            String snacksChoice = input.next();

            if (snacksChoice.equalsIgnoreCase("yes")) {
                ticketPrice += 80;
            }

            System.out.println("Total Ticket Price: ₹" + ticketPrice);
            System.out.println("\nNext customer? (1 = Yes, 0 = No)");
            customerChoice = input.nextInt();
        }

        input.close();
        System.out.println("Booking Closed ");
    
	}
  
   
}