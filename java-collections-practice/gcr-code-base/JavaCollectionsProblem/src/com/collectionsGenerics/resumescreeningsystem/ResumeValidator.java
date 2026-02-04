package com.collectionsGenerics.resumescreeningsystem;

class ResumeValidator {

    public static <T extends JobRole> void validate(Resume<T> resume) {
        System.out.println("Validating resume for " + resume.getJobRole().getRoleName());
    }
}