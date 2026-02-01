package com.functionalinterfaces.unitconversiontool;

public class UseUnitConversion {
	 public static void main(String[] args) {

	        double distanceKm = 100;
	        double weightKg = 50;

	        double distanceMiles = UnitConverter.kmToMiles(distanceKm);
	        double weightLbs = UnitConverter.kgToLbs(weightKg);

	        System.out.println(distanceKm + " kilometers is " + distanceMiles + " miles");
	        System.out.println(weightKg + " kilograms is " + weightLbs + " pounds");
	    }

}
