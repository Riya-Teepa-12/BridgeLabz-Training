
import java.util.*;

public class DistanceTracker{
   public static void main(String []args){
   
      //create scanner object to take input from user

        Scanner input = new Scanner(System.in);

        int totalDistance = 0;
        int distancePerStop = 2;
        boolean journey = true;

        while (journey) {
            totalDistance += distancePerStop;
            System.out.println("Bus reached next stop.");
            System.out.println("Distance covered so far: " + totalDistance + " km");

            System.out.print("Do you want to get off? (yes/no): ");
            String choice = input.next();

            if (choice.equalsIgnoreCase("yes")) {
                journey = false;
            }
        }

        System.out.println("Passenger got down.");
        System.out.println("Total distance traveled: " + totalDistance + " km");

        input.close();
          }
}