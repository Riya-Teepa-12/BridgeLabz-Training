package com.day4.learningplatform;

public abstract class User {
    
	//attributes
	protected String name;
	protected String email;
	protected int userId;
	
	// constructor
	public User(String name, String email, int userId) {
		super();
		this.name = name;
		this.email = email;
		this.userId = userId;
	}

     
	
	
}
