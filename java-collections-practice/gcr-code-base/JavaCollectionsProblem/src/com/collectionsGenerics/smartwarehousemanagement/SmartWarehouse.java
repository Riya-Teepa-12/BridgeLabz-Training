package com.collectionsGenerics.smartwarehousemanagement;

public class SmartWarehouse {
	 public static void main(String[] args) {

	        Storage<Electronics> electronicsStorage = new Storage<>();
	        electronicsStorage.addItem(new Electronics("E101", "Laptop", 2));
	        electronicsStorage.addItem(new Electronics("E102", "Mobile", 1));

	        Storage<Groceries> groceriesStorage = new Storage<>();
	        groceriesStorage.addItem(new Groceries("G201", "Rice", "2026-05-10"));
	        groceriesStorage.addItem(new Groceries("G202", "Milk", "2025-02-01"));

	        Storage<Furniture> furnitureStorage = new Storage<>();
	        furnitureStorage.addItem(new Furniture("F301", "Chair", "Wood"));
	        furnitureStorage.addItem(new Furniture("F302", "Table", "Steel"));

	        System.out.println("---- Electronics ----");
	        WarehouseUtil.displayAllItems(electronicsStorage.getItems());

	        System.out.println("\n---- Groceries ----");
	        WarehouseUtil.displayAllItems(groceriesStorage.getItems());

	        System.out.println("\n---- Furniture ----");
	        WarehouseUtil.displayAllItems(furnitureStorage.getItems());
	    }
}
