package com.streams.doctoravailability;

public class Doctor {
     
	private String name;
    private String specialty;
    private boolean availableOnWeekend;
    Doctor(String name,String specialty,boolean availableOnWeekend){
        this.name=name;
        this.specialty=specialty;
        this.availableOnWeekend=availableOnWeekend;
    }
    public String getSpecialty(){return specialty;}
    public boolean isAvailableOnWeekend(){return availableOnWeekend;}
    public String toString(){
        return name+" | "+specialty+" | Weekend: "+availableOnWeekend;
    }
}
