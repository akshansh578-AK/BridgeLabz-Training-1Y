package com.gla.classesobjects.constructors;

public class Vehicle {
    private String vehicleName;
    private static double registrationFee = 1200.0;

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public static void updateRegistrationFee(double newFee) {
        if (newFee >= 0) {
            registrationFee = newFee;
        }
    }

    public void displayDetails() {
        System.out.println("Vehicle: " + vehicleName + ", Registration Fee: " + registrationFee);
    }
}
