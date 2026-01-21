package com.collectionsGenerics.smartwarehousemanagement;

public class Electronics extends WarehouseItem {
    private int warrantyYears;

    public Electronics(String itemId, String name, int warrantyYears) {
        super(itemId, name);
        this.warrantyYears = warrantyYears;
    }

   
    public void displayDetails() {
        System.out.println("Electronics | ID: " + getItemId() +
                ", Name: " + getName() +
                ", Warranty: " + warrantyYears + " years");
    }
}
