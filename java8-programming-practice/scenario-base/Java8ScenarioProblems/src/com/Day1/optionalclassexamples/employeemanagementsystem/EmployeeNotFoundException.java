package com.Day1.optionalclassexamples.employeemanagementsystem;


class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
