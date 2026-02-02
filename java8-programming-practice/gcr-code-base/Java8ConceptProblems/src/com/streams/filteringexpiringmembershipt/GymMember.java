package com.streams.filteringexpiringmembershipt;

import java.util.*;
import java.time.*;


public class GymMember {
       
	 private String name;
	    private LocalDate expiryDate;
	    GymMember(String name,LocalDate expiryDate){
	        this.name=name;
	        this.expiryDate=expiryDate;
	    }
	    LocalDate getExpiryDate(){return expiryDate;}
	    public String toString(){
	        return name+" | Expiry: "+expiryDate;
	    }
}
