package com.gla.methods.level2;

import java.util.Scanner;

public class UnitConverterPart3 {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double poundsToKilograms(double pounds) {
        return pounds / 2.20462;
    }

    public static double litersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static double gallonsToLiters(double gallons) {
        return gallons / 0.264172;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        System.out.print("Enter weight in kilograms: ");
        double kilograms = scanner.nextDouble();
        System.out.print("Enter volume in liters: ");
        double liters = scanner.nextDouble();

        System.out.println("Fahrenheit: " + celsiusToFahrenheit(celsius));
        System.out.println("Celsius from Fahrenheit: " + fahrenheitToCelsius(celsiusToFahrenheit(celsius)));
        System.out.println("Pounds: " + kilogramsToPounds(kilograms));
        System.out.println("Kilograms from pounds: " + poundsToKilograms(kilogramsToPounds(kilograms)));
        System.out.println("Gallons: " + litersToGallons(liters));
        System.out.println("Liters from gallons: " + gallonsToLiters(litersToGallons(liters)));
        scanner.close();
    }
}
