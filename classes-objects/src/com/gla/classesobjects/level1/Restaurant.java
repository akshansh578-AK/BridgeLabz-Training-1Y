package com.gla.classesobjects.level1;

public class Restaurant {
    private String name;
    private String location;
    private String[] foodItems;

    public Restaurant(String name, String location, String[] foodItems) {
        this.name = name;
        this.location = location;
        this.foodItems = foodItems;
    }

    public void displayDetails() {
        System.out.println("=== Restaurant Details ===");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Food Items:");
        for (int i = 0; i < foodItems.length; i++) {
            System.out.println((i + 1) + ". " + foodItems[i]);
        }
    }

    public boolean isFoodAvailable(String food) {
        for (String foodItem : foodItems) {
            if (foodItem.equalsIgnoreCase(food)) {
                return true;
            }
        }
        return false;
    }
}
