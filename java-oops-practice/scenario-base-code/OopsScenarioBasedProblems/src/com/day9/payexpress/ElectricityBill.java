package com.day9.payexpress;

import java.time.LocalDate;


public class ElectricityBill  extends Bill implements IPayable {

    public ElectricityBill(double amount, LocalDate dueDate) {
        super("Electricity", amount, dueDate);
    }

    public void pay() {
        if (!isPaid()) {
            markAsPaid();
            System.out.println("Electricity bill paid successfully.");
        }
    }

    public void sendReminder() {
        System.out.println("⚡ Electricity Bill Reminder: Please pay before power disconnection.");
    }

    public void displayBill() {
        System.out.println("Type: Electricity | Amount: " + getAmount() +
                " | Due Date: " + getDueDate() +
                " | Paid: " + isPaid());
    }

}
