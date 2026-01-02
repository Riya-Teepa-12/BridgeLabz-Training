package com.day1.hospitalmanagement;

public class InPatient extends Patient {
    private int daysAdmitted;

    public InPatient(int id, String name, int age, int daysAdmitted) {
        super(id, name, age);
        this.daysAdmitted = daysAdmitted;
    }

  
    public void displayInfo() {
        System.out.println(getSummary() + ", Type: In-Patient, Days Admitted: " + daysAdmitted);
    }

}
