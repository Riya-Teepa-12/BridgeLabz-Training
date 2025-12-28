package com.constructor.Level1;

public class PostgraduateStudent extends Student {
	private String specialization;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPGDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Name (Protected Access): " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA (via public method): " + getCGPA());
    }
}
