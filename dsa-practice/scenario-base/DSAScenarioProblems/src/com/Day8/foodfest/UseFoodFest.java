package com.Day8.foodfest;

import java.util.*;

public class UseFoodFest {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        List<Stall> masterList = new ArrayList<>();

	        System.out.print("Enter number of zones: ");
	        int zones = sc.nextInt();

	        for (int z = 1; z <= zones; z++) {
	            System.out.print("\nEnter number of stalls in Zone " + z + ": ");
	            int stalls = sc.nextInt();

	            System.out.println("Enter stall name and footfall (sorted):");
	            for (int i = 0; i < stalls; i++) {
	                String name = sc.next();
	                int footfall = sc.nextInt();
	                masterList.add(new Stall(name, footfall));
	            }
	        }

	        FoodFest.mergeSort(masterList, 0, masterList.size() - 1);

	        System.out.println("\nMaster Footfall List:");
	        for (Stall s : masterList) {
	            System.out.println(s);
	        }

	        sc.close();
	    }
}
