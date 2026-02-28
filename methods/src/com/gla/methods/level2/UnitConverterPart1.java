package com.gla.methods.level2;

import java.util.Scanner;

public class UnitConverterPart1 {
    public static double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    public static double milesToKilometers(double miles) {
        return miles / 0.621371;
    }

    public static double metersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double feetToMeters(double feet) {
        return feet / 3.28084;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter kilometers: ");
        double kilometers = scanner.nextDouble();
        System.out.print("Enter meters: ");
        double meters = scanner.nextDouble();

        System.out.println("Miles: " + kilometersToMiles(kilometers));
        System.out.println("Kilometers from miles: " + milesToKilometers(kilometersToMiles(kilometers)));
        System.out.println("Feet: " + metersToFeet(meters));
        System.out.println("Meters from feet: " + feetToMeters(metersToFeet(meters)));
        scanner.close();
    }
}
