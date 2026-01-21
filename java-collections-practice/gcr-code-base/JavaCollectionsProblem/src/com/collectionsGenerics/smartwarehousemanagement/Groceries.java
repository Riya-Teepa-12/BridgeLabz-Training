package com.collectionsGenerics.smartwarehousemanagement;

public class Groceries extends WarehouseItem {
    private String expiryDate;

    public Groceries(String itemId, String name, String expiryDate) {
        super(itemId, name);
        this.expiryDate = expiryDate;
    }

    
    public void displayDetails() {
        System.out.println("Groceries | ID: " + getItemId() +
                ", Name: " + getName() +
                ", Expiry: " + expiryDate);
    }
}
