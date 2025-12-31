package com.objectmodelling.Level1;

public class DepartmentDemo {
	private String deptName;

    DepartmentDemo(String deptName) {
        this.deptName = deptName;
    }

    void showDepartment() {
        System.out.println(" Department: " + deptName);
    }
}
