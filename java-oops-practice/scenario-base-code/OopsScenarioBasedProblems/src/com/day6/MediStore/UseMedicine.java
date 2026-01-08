package com.day6.MediStore;

import java.time.LocalDate;

public class UseMedicine {
	 public static void main(String[] args) {
	        Medicine tab = new Tablet2("Paracetamol", 5.0, LocalDate.of(2026, 6, 1));
	        Medicine syrup = new Syrup("Cough Syrup", 120.0, LocalDate.of(2026, 3, 1));

	        System.out.println("Tablet Sale Price: " + tab.sell(6));
	        System.out.println("Syrup Sale Price: " + syrup.sell(2));
	    }

}
