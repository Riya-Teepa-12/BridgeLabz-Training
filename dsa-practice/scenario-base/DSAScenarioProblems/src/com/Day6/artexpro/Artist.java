package com.Day6.artexpro;

public class Artist {
     
	 String name;
	    int registrationTime; 

	    public Artist(String name, int registrationTime) {
	        this.name = name;
	        this.registrationTime = registrationTime;
	    }

	    @Override
	    public String toString() {
	        return name + " (" + registrationTime + ")";
 }
}
