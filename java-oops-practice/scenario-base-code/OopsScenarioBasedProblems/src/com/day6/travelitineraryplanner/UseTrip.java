package com.day6.travelitineraryplanner;

public class UseTrip {

	
	public static void main(String[] args) {
    Transport t1 = new Transport(15000);
    Hotel h1 = new Hotel(20000);
    Activity a1 = new Activity(5000);

    Trip domestic = new DomesticTrip("Goa", 5, t1, h1, a1);
    domestic.book();

    System.out.println();

    Transport t2 = new Transport(60000);
    Hotel h2 = new Hotel(40000);
    Activity a2 = new Activity(15000);

    Trip international = new InternationalTrip("Paris", 7, t2, h2, a2);
    international.book();
}

}
