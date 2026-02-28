package com.gla.methods.level2;

import java.util.Scanner;

public class UnitConverterPart2 {
    public static double yardsToFeet(double yards) {
        return yards * 3.0;
    }

    public static double feetToYards(double feet) {
        return feet / 3.0;
    }

    public static double inchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double inchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter yards: ");
        double yards = scanner.nextDouble();
        System.out.print("Enter inches: ");
        double inches = scanner.nextDouble();

        System.out.println("Feet: " + yardsToFeet(yards));
        System.out.println("Yards from feet: " + feetToYards(yardsToFeet(yards)));
        System.out.println("Meters: " + inchesToMeters(inches));
        System.out.println("Centimeters: " + inchesToCentimeters(inches));
        scanner.close();
    }
}
