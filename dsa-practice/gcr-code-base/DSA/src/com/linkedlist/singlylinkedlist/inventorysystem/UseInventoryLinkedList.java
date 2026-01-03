package com.linkedlist.singlylinkedlist.inventorysystem;

public class UseInventoryLinkedList {
	public static void main(String[] args) {

        InventoryLinkedList inventory = new InventoryLinkedList();

        inventory.addAtEnd(101, "Laptop", 5, 55000);
        inventory.addAtBeginning(102, "Mouse", 20, 500);
        inventory.addAtEnd(103, "Keyboard", 10, 1500);
        inventory.addAtSpecificPosition(2, 104, "Monitor", 7, 12000);

        System.out.println("---- Inventory ----");
        inventory.displayInventory();

        System.out.println("\nTotal Inventory Value: " + inventory.calculateTotalValue());

        System.out.println("\nSearch by ID:");
        inventory.searchById(103);
       
        System.out.println("\nUpdate Quantity:");
        inventory.updateQuantity(101, 8);
        inventory.displayInventory();

        System.out.println("\nSort by Price (Ascending):");
        inventory.sortByPrice(true);
        inventory.displayInventory();

        System.out.println("\nSort by Name (Descending):");
        inventory.sortByName(false);
        inventory.displayInventory();

        System.out.println("\nRemove Item ID 102:");
        inventory.deleteNode(102);
        inventory.displayInventory();
	}
}
