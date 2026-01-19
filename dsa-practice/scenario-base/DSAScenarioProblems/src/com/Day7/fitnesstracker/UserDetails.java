package com.Day7.fitnesstracker;

public class UserDetails {
	
     private String name;
     private int counts;
     
	 public String getName() {
		return name;
	}

	 public void setName(String name) {
		 this.name = name;
	 }

	 public int getCounts() {
		 return counts;
	 }

	 public void setCounts(int counts) {
		 this.counts = counts;
	 }

	 public UserDetails(String name, int counts) {
		this.name = name;
		this.counts = counts;
	 }
     
}
