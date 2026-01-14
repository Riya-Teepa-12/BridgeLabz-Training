package com.day9.payexpress;

import java.time.LocalDate;

public class InternetBill extends Bill implements IPayable {

		    public InternetBill(double amount, LocalDate dueDate) {
		        super("Internet", amount, dueDate);
		    }

		    public void pay() {
		        if (!isPaid()) {
		            markAsPaid();
		            System.out.println("Internet bill paid successfully.");
		        }
		    }

		    public void sendReminder() {
		        System.out.println("🌐 Internet Bill Reminder: Avoid service interruption.");
		    }

		    public void displayBill() {
		        System.out.println("Type: Internet | Amount: " + getAmount() +
		                " | Due Date: " + getDueDate() +
		                " | Paid: " + isPaid());
		    }

}
