package com.collectionsGenerics.smartwarehousemanagement;

public abstract class WarehouseItem {
	 private String itemId;
	    private String name;

	    public WarehouseItem(String itemId, String name) {
	        this.itemId = itemId;
	        this.name = name;
	    }

	    public String getItemId() {
	        return itemId;
	    }

	    public String getName() {
	        return name;
	    }

	    // Every item must describe itself
	    public abstract void displayDetails();
}
