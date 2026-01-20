package com.collections.queueinterface;

import java.util.*;

class Patient {
	String name;
	int priority;
	public Patient(String name, int priority) {
		this.name = name;
		this.priority = priority;
	}
	
	public String toString() {
		return "Patient [name=" + name + ", priority=" + priority + "]";
	}
	
	
}

class Checker implements Comparator<Patient>{

	public int compare(Patient p1, Patient p2) {
		return p2.priority-p1.priority;
	}
    
}

public class HospitalTriageSystem {
    
	
	

	public static void main(String []args) {
		Patient p = new Patient("Alice",5); 
		Patient p1 = new Patient("Bob",6); 
		Patient p2 = new Patient("John",3); 
		Patient p3 = new Patient("Jony",4); 
		PriorityQueue<Patient> pt = new PriorityQueue<>(new Checker());
		pt.add(p);
		pt.add(p1);
		pt.add(p2);
		pt.add(p3);
		while(!pt.isEmpty()) {
			System.out.println(pt.poll());
		}
	} 
}
