package com.gla.classesobjects.level2;

public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = Math.max(quantity, 0);
    }

    public void addItem(int count) {
        if (count > 0) {
            quantity += count;
        }
    }

    public void removeItem(int count) {
        if (count > 0) {
            quantity = Math.max(0, quantity - count);
        }
    }

    public void displayTotalCost() {
        System.out.println("=== Cart Item Details ===");
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + (price * quantity));
    }
}
