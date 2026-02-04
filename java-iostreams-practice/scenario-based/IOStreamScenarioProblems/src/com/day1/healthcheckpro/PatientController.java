package com.day1.healthcheckpro;

public class PatientController {

    @PublicAPI(description = "Register new patient")
    public void registerPatient() {
    }

    @RequiresAuth(role = "ADMIN")
    public void removePatient() {
    }

}
