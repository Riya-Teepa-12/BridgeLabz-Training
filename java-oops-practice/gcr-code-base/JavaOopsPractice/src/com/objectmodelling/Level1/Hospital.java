package com.objectmodelling.Level1;

import java.util.*;

public class Hospital {
	 private String hospitalName;
	    private List<Doctor> doctors = new ArrayList<>();
	    private List<Patient> patients = new ArrayList<>();

	    public Hospital(String hospitalName) {
	        this.hospitalName = hospitalName;
	    }

	    public void addDoctor(Doctor doctor) {
	        doctors.add(doctor);
	    }

	    public void addPatient(Patient patient) {
	        patients.add(patient);
	    }

	    public void showHospitalInfo() {
	        System.out.println("Hospital: " + hospitalName);
	        System.out.println("Doctors available: " + doctors.size());
	        System.out.println("Patients registered: " + patients.size());
	    }
      
}
