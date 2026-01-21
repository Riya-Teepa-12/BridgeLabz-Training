package com.Day8.movietime;
import java.time.LocalTime;

public class ShowDetails {
    private String name;
    private LocalTime time;
    
	public ShowDetails(String name, LocalTime time) {
		this.name = name;
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
    
}
