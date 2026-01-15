package com.Day4.hospitalqueue;

import java.time.LocalTime;

public class ArrivalPatient {
       private String patientName;
       private LocalTime time;
       private int criticallyLevel;
       
       
	   public ArrivalPatient(String patientName, LocalTime time, int criticallyLevel) {
		this.patientName = patientName;
		this.time = time;
		this.criticallyLevel = criticallyLevel;
	   }


	   public String getPatientName() {
		   return patientName;
	   }


	   public void setPatientName(String patientName) {
		   this.patientName = patientName;
	   }


	   public LocalTime getTime() {
		   return time;
	   }


	   public void setTime(LocalTime time) {
		   this.time = time;
	   }


	   public int getCriticallyLevel() {
		   return criticallyLevel;
	   }


	   public void setCriticallyLevel(int criticallyLevel) {
		   this.criticallyLevel = criticallyLevel;
	   }
       
	  
	   
       
}
