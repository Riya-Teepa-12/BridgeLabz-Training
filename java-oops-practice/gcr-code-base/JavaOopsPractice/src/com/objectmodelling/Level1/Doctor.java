package com.objectmodelling.Level1;

import java.util.*;

public class Doctor {
	 private String name;
	    private List<Patient> patients = new ArrayList<>();

	    public Doctor(String name) {
	        this.name = name;
	    }
       
	    
	    public String getName() {
	        return name;
	    }
	   
	    public void consult(Patient patient) {
	        patients.add(patient);
	        System.out.println("Doctor " + name + " is consulting patient " + patient.getName());
	    }
        
	    
    
}
