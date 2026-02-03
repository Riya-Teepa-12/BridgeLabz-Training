package com.Day1.optionalclassexamples.employeemanagementsystem;

import java.util.Optional;

class Employee {
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String manager;
    private Double bonus;
    private String insurance;

    public Employee(int id, String firstName, String middleName,
                    String lastName, String email,
                    String manager, Double bonus, String insurance) {

        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.manager = manager;
        this.bonus = bonus;
        this.insurance = insurance;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Optional<String> getManager() {
        return Optional.ofNullable(manager);
    }

    public Optional<Double> getBonus() {
        return Optional.ofNullable(bonus);
    }

    public Optional<String> getInsurance() {
        return Optional.ofNullable(insurance);
    }

    public Optional<String> getMiddleName() {
        return Optional.ofNullable(middleName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

