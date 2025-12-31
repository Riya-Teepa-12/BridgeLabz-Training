package com.objectmodelling.Level1;

import java.util.ArrayList;
import java.util.List;

public class University {

        //attributes
	 private String universityName;
	    private List<Department> departments = new ArrayList<>();
	    private List<Faculty> faculties = new ArrayList<>();

	    University(String universityName) {
	        this.universityName = universityName;
	    }

	    // Composition departments created inside university
	    void addDepartment(String deptName) {
	        departments.add(new Department(deptName));
	    }

	    // Aggregation faculty passed from outside
	    void addFaculty(Faculty faculty) {
	        faculties.add(faculty);
	    }

	    void showUniversity() {
	        System.out.println("University: " + universityName);

	        System.out.println("Departments:");
	        for (Department d : departments) {
	            d.showDepartment();
	        }

	        System.out.println("Faculties:");
	        for (Faculty f : faculties) {
	            f.showFaculty();
	        }
	    }

	    void deleteUniversity() {
	        departments.clear(); 
	        System.out.println("University deleted. All departments removed.");
	    }
}
