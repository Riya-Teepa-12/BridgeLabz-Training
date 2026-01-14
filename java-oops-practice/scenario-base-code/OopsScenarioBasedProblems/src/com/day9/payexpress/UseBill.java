package com.day9.payexpress;

import java.time.LocalDate;

public class UseBill {
	
	 public static void main(String[] args) {

	        PayXpressSystem system = new PayXpressSystem();

	        system.addBill(new ElectricityBill(1200, LocalDate.of(2026, 1, 20)));
	        system.addBill(new InternetBill(999, LocalDate.of(2026, 1, 18)));
	        system.addBill(new WaterBill(450, LocalDate.of(2026, 1, 22)));

	        System.out.println("---- All Bills ----");
	        system.displayAllBills();

	        System.out.println("\n---- Reminders ----");
	        system.sendAllReminders();

	        System.out.println("\n---- Paying Bills ----");
	        system.payAllBills();

	        System.out.println("\n---- Updated Bills ----");
	        system.displayAllBills();
	    }

}
