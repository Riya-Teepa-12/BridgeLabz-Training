package com.Day9.ecommerceinventory;

public class UseEcommerce {
	public static void main(String[] args) {

        ProductBST inventory = new ProductBST();

        inventory.root = inventory.insert(inventory.root, 1005, "Laptop", 55000.0);
        inventory.insert(inventory.root, 1002, "Mouse", 500.0);
        inventory.insert(inventory.root, 1010, "Keyboard", 1200.0);
        inventory.insert(inventory.root, 1008, "Monitor", 15000.0);

        System.out.println("Product List (Sorted by SKU)");
        inventory.inorder(inventory.root);

        System.out.println();
        System.out.println("Updating price of SKU 1002");
        inventory.updatePrice(1002, 550.0);

        System.out.println();
        System.out.println("Updated Product List");
        inventory.inorder(inventory.root);
    }
}
