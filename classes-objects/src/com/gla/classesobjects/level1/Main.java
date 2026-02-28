package com.gla.classesobjects.level1;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Riya", 1, 55000.0);
        employee.displayDetails();
        System.out.println();

        Circle circle = new Circle(7.0);
        circle.displayDetails();
        System.out.println();

        Item item = new Item("ITM101", "Notebook", 45.0);
        item.displayItemDetails();
        System.out.println("Total cost for 3 items: " + item.calculateTotalCost(3));
        System.out.println();

        MobilePhone mobilePhone = new MobilePhone("Samsung", "Galaxy S24", 79999.0);
        mobilePhone.displayDetails();
    }
}
