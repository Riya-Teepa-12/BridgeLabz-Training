package com.day10.GeoMeasureSolution;

import java.util.*;

public class GeoMeasureApp {
	// Method to compare two lines
    public static void compareLines(LineSegment l1, LineSegment l2) {
        double length1 = l1.calculateLength();
        double length2 = l2.calculateLength();

        System.out.println("Length of Line 1: " + length1);
        System.out.println("Length of Line 2: " + length2);

        if (Double.compare(length1, length2) == 0) {
            System.out.println("Both lines are of equal length.");
        } else if (length1 > length2) {
            System.out.println("Line 1 is longer.");
        } else {
            System.out.println("Line 2 is longer.");
        }
   }
}
