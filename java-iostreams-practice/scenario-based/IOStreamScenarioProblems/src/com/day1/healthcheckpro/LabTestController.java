package com.day1.healthcheckpro;

public class LabTestController {

    @PublicAPI(description = "Get list of all lab tests")
    public void getAllTests() {
    }

    @PublicAPI(description = "Book a lab test")
    @RequiresAuth(role = "PATIENT")
    public void bookTest() {
    }

    // Missing annotation
    public void deleteTest() {
    }
}