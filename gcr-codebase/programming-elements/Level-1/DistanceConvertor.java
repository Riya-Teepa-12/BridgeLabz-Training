import java.util.Scanner;

class DistanceConverter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Conversions
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        // displaying the distance in yards and feet
        System.out.println("The distance in yards is " + distanceInYards +
                           " while the distance in miles is " + distanceInMiles);
    }
}
