package com.Day6.fleetmanager;

import java.util.*;

public class UseFleetManager {
	// Main Method
    public static void main(String[] args) {

        List<Vehicle> masterList = new ArrayList<>();

        // Depot 1 (sorted)
        masterList.add(new Vehicle(101, 12000));
        masterList.add(new Vehicle(102, 18000));

        // Depot 2 (sorted)
        masterList.add(new Vehicle(201, 15000));
        masterList.add(new Vehicle(202, 22000));

        // Depot 3 (sorted)
        masterList.add(new Vehicle(301, 10000));
        masterList.add(new Vehicle(302, 30000));

        FleetManager.mergeSort(masterList);

        System.out.println("Master Maintenance Schedule:");
        for (Vehicle v : masterList) {
            System.out.println(v);
        }
    }
}
