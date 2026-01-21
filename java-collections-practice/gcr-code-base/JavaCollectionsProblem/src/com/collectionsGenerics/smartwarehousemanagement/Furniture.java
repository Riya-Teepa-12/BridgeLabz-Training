package com.collectionsGenerics.smartwarehousemanagement;

public class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String itemId, String name, String material) {
        super(itemId, name);
        this.material = material;
    }

    
    public void displayDetails() {
        System.out.println("Furniture | ID: " + getItemId() +
                ", Name: " + getName() +
                ", Material: " + material);
    }
}
