package com.objectmodelling.Level1;

public class Professor {
       
        //attributes
	 private int professorId;
	    private String name;

            //constructor
	    public Professor(int professorId, String name) {
	        this.professorId = professorId;
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }
}
