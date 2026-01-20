package com.day10.ballnballorganizer;

public class Ball implements Storable{
	private String id;
    private String color;
    private String size; 

    public Ball(String id, String color, String size) {
        this.id = id;
        this.color = color;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

   
    public String getDescription() {
        return "Ball [ID=" + id + ", Color=" + color + ", Size=" + size + "]";
    }
}
