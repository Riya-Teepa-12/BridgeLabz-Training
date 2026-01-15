package com.Day4.hospitalqueue;

import java.time.LocalTime;
import java.util.*;
public class HospitalQueue {
	public static List<ArrivalPatient> list = new ArrayList<>();
	private ArrivalPatient p;
	
	public static  void displayDetails() {
		int i=0;
    	for(ArrivalPatient p:list) {
    		System.out.println("Patient Name "+p.getPatientName());
    		System.out.println("Treatment will be given "+(i+1)+" of Critical Level "+p.getCriticallyLevel());
    		i++;
    	}
    }
	   
   public static void main(String []args) {
	   ArrivalPatient p1 = new ArrivalPatient("Dhavi", LocalTime.now(), 2);
	   ArrivalPatient p2 = new ArrivalPatient("Jishad", LocalTime.now(), 8);
	   ArrivalPatient p3 = new ArrivalPatient("avi", LocalTime.now(), 10);
	   ArrivalPatient p4 = new ArrivalPatient("ishad", LocalTime.now(), 9);
	   ArrivalPatient p5 = new ArrivalPatient("Dhrvi", LocalTime.now(), 4);
	   ArrivalPatient p6 = new ArrivalPatient("isha", LocalTime.now(), 6);
	   ArrivalPatient p7 = new ArrivalPatient("havi", LocalTime.now(), 5);
	   ArrivalPatient p8 = new ArrivalPatient("Jish", LocalTime.now(), 3);

	    list.add(p1);
	    list.add(p2);
	    list.add(p3);
	    list.add(p4);
	    list.add(p5);
	    list.add(p6);
	    list.add(p7);
	    list.add(p8);
	    SortArrival d=new SortArrival();
	    d.sortPatient(list);
	    displayDetails();
	    
	   
   }
}
