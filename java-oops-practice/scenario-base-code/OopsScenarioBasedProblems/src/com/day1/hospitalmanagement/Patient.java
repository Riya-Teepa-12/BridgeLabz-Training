package com.day1.hospitalmanagement;

public abstract class Patient {
	 private int patientId;
	    private String name;
	    private int age;
	    private String medicalHistory; //(PRIVATE)

	    // Constructor for normal admission
	    public Patient(int patientId, String name, int age) {
	        this.patientId = patientId;
	        this.name = name;
	        this.age = age;
	        this.medicalHistory = "Not Disclosed";
	    }

	    // Overloaded constructor for emergency admission
	    public Patient(int patientId, String name, int age, String medicalHistory) {
	        this.patientId = patientId;
	        this.name = name;
	        this.age = age;
	        this.medicalHistory = medicalHistory;
	    }

	    // Encapsulation via getters
	    public int getPatientId() {
	        return patientId;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getSummary() {
	        return "Patient ID: " + patientId +
	               ", Name: " + name +
	               ", Age: " + age;
	    }

	    // Polymorphic method
	    public abstract void displayInfo();
} 
