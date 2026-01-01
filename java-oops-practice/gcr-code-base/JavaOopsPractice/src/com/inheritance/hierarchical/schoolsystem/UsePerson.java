package com.inheritance.hierarchical.schoolsystem;

public class UsePerson {
	 public static void main(String[] args) {
	        Teacher t = new Teacher("Mr. Sharma", 40, "Mathematics");
	        Student s = new Student("Aditi", 15, 10);
	        Staff st = new Staff("Ramesh", 45, "Administration");

	        t.displayRole();
	        System.out.println();

	        s.displayRole();
	        System.out.println();

	        st.displayRole();
	    }

}
