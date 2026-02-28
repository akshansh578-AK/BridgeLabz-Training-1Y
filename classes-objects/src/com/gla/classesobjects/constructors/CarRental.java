package com.gla.classesobjects.constructors;

public class CarRental {
    private String carModel;
    private double dailyRate;
    private int days;

    public CarRental(String carModel, double dailyRate, int days) {
        this.carModel = carModel;
        this.dailyRate = dailyRate;
        this.days = days;
    }

    public double calculateTotalCost() {
        return dailyRate * days;
    }

    public void displayDetails() {
        System.out.println("CarRental: " + carModel + ", Total Cost: " + calculateTotalCost());
    }
}
