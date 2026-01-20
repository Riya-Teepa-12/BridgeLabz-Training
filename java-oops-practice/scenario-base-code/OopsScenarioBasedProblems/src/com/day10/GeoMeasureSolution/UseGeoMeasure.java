package com.day10.GeoMeasureSolution;

import java.util.*;

public class UseGeoMeasure {
      
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        List<LineSegment> lines = new ArrayList<>();

	        System.out.print("Enter number of line comparisons: ");
	        int n = sc.nextInt();

	        for (int i = 1; i <= n; i++) {

	            System.out.println("\nEnter coordinates for Line 1:");
	            double x1 = sc.nextDouble();
	            double y1 = sc.nextDouble();
	            double x2 = sc.nextDouble();
	            double y2 = sc.nextDouble();

	            LineSegment line1 = new LineSegment(x1, y1, x2, y2);

	            System.out.println("Enter coordinates for Line 2:");
	            double a1 = sc.nextDouble();
	            double b1 = sc.nextDouble();
	            double a2 = sc.nextDouble();
	            double b2 = sc.nextDouble();

	            LineSegment line2 = new LineSegment(a1, b1, a2, b2);

	            lines.add(line1);
	            lines.add(line2);

	            System.out.println("\nComparison Result:");
	            GeoMeasureApp.compareLines(line1, line2);
	        }
	        
	        sc.close();
	    }

}
