package com.Day9.medwarehouse;

import java.time.LocalDate;

public class MedicineDetails {
	
    private String medicineName;
    private LocalDate expiryDate;
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	public MedicineDetails(String medicineName, LocalDate expiryDate) {
		this.medicineName = medicineName;
		this.expiryDate = expiryDate;
	}
    
}
