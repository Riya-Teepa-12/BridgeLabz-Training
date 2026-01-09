package com.day7.artify;

public class User {

    private String name;
    private double walletBalance;

    public User(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
    }

    public void deductBalance(double amount) {
        walletBalance -= amount; // operator usage
    }

    public void showBalance() {
        System.out.println("Wallet Balance: " + walletBalance);
    }

}
