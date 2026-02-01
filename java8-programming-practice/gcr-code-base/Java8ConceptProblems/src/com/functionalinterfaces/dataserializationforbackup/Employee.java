package com.functionalinterfaces.dataserializationforbackup;

public class Employee implements Backupable {
	 private int id;
	    private String name;

	    public Employee(int id, String name) {
	        this.id=id;
	        this.name=name;
	    }

	    @Override
	    public String toString() {
	        return "Employee id: " + id + ", name: " + name;
	    }

}
