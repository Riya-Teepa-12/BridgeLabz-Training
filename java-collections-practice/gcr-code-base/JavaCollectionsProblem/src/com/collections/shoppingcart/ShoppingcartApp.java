package com.collections.shoppingcart;

public class ShoppingcartApp{
public static void main(String[] args) {

    ShoppingCart cart = new ShoppingCart();

    cart.addProduct("Desktop", 55000);
    cart.addProduct("Cable", 500);
    cart.addProduct("Tablet", 12000);
    cart.addProduct("Monitor", 12000);

    cart.displayProducts();
    cart.displayInsertionOrder();
    cart.displaySortedByPrice();
 }
}