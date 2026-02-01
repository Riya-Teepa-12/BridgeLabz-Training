package com.functionalinterfaces.sensitivedatatagging;

public class Employee implements SensitiveData {
	private int id;
    private String name;
    private String ssn;

    public Employee(int id, String name, String ssn) {
        this.id=id;
        this.name=name;
        this.ssn=ssn;
    }

    @Override
    public String toString() {
        return "Employee id: " + id + ", name: " + name + ", ssn: " + ssn;
    }

}
