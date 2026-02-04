package com.day1.healthcheckpro;

public class HealthCheck {

    public static void main(String[] args) {

        APIDocumentationGenerator.generateDocs(LabTestController.class);
        APIDocumentationGenerator.generateDocs(PatientController.class);
    
    }

}