package com.lambdaExceptions.methodreferences.hospitalpatientidprinting;

public class Patient {
	  private int patientId;
	    private String name;

	    public Patient(int patientId, String name) {
	        this.patientId=patientId;
	        this.name=name;
	    }

	    public int getPatientId() {
	        return patientId;
	    }

}
