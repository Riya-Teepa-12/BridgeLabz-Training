package com.day9.payexpress;

import java.time.LocalDate;

public class WaterBill extends Bill implements IPayable {

    public WaterBill(double amount, LocalDate dueDate) {
        super("Water", amount, dueDate);
    }

    public void pay() {
        if (!isPaid()) {
            markAsPaid();
            System.out.println("Water bill paid successfully.");
        }
    }

    public void sendReminder() {
        System.out.println("Water Bill Reminder: Pay to avoid supply suspension.");
    }

    public void displayBill() {
        System.out.println("Type: Water | Amount: " + getAmount() +
                " | Due Date: " + getDueDate() +
                " | Paid: " + isPaid());
    }

}
