package com.lambdaExceptions.methodreferences.hospitalpatientidprinting;

import java.util.List;

public class PatientService {
	public static void printPatientIds(List<Patient> patients) {

        // Method reference instead of lambda
        patients.stream().map(Patient::getPatientId).forEach(System.out::println);
    }

}
