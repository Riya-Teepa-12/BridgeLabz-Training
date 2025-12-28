package com.constructor.Level1;

public class BookLibrary {
    
	//attributes 
	public String ISBN;
	protected String title;
	private String author;
	
	//getter  for author 
	public String getAuthor() {
		return author;
	}
	
	//setter for author
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//constructor
	public BookLibrary(String iSBN, String title, String author) {
		this.ISBN = iSBN;
		this.title = title;
		this.author = author;
	}
	
	
}
