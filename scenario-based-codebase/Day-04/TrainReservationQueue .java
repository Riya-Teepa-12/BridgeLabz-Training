import java.util.Scanner;

public class TrainReservationQueue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int totalSeats = 5;   
        int choice;

        System.out.println("Welcome to Train Reservation System");

        // Loop to allow multiple actions
        while (true) {

            // Display menu
            System.out.println("\nMenu:");
            System.out.println("1. Book Ticket");
            System.out.println("2. Check Available Seats");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    if (totalSeats > 0) {
                        totalSeats--;
                        System.out.println("Ticket booked successfully!");
                        System.out.println("Remaining seats: " + totalSeats);
                    } else {
                        System.out.println("No seats available. Booking closed!");
                        break; 
                    }
                    break;

                case 2:
                    System.out.println("Available seats: " + totalSeats);
                    break;

                case 3:
                    System.out.println("Thank you for using Train Reservation System.");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

          
            if (totalSeats == 0) {
                System.out.println("\nAll seats are booked. System closed.");
                break;
            }
        }
		input.close();
    }
}
