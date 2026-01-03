package com.day2.ridehailing;

import java.util.*;

public class UseVehicle {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Driver input
        System.out.print("Enter Driver Name: ");
        String name = sc.nextLine();

        System.out.print("Enter License Number: ");
        String license = sc.nextLine();

        System.out.print("Enter Driver Rating: ");
        double rating = sc.nextDouble();
        sc.nextLine(); 

        Driver driver = new Driver(name, license, rating);

        // Vehicle input
        System.out.println("\nChoose Vehicle Type:");
        System.out.println("1. Mini");
        System.out.println("2. Sedan");
        System.out.println("3. SUV");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = sc.nextLine();

        Vehicle vehicle = null;

        switch (choice) {
            case 1:
                vehicle = new Mini(vehicleNumber);
                break;
            case 2:
                vehicle = new Sedan(vehicleNumber);
                break;
            case 3:
                vehicle = new SUV(vehicleNumber);
                break;
            default:
                System.out.println("Invalid vehicle choice!");
                System.exit(0);
        }

        // Distance input
        System.out.print("\nEnter Distance (in km): ");
        double distance = sc.nextDouble();

        IRideService rideService = new RideService();
        rideService.bookRide(driver, vehicle, distance);
        rideService.endRide();

        sc.close();
    }

}
