package com.lambdaExceptions.methodreferences.hospitalpatientidprinting;

import java.util.ArrayList;
import java.util.List;

public class UsePatient {
	 public static void main(String[] args) {

	        List<Patient> patients=new ArrayList<>();

	        patients.add(new Patient(1001, "Rahul"));
	        patients.add(new Patient(1002, "Anita"));
	        patients.add(new Patient(1003, "Suresh"));

	        PatientService.printPatientIds(patients);
	    }

}
