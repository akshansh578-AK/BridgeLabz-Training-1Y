package com.gla.methods.level1;

import java.util.Scanner;

public class TrigonometricFunctions {
    public static double toRadians(double degree) {
        return Math.toRadians(degree);
    }

    public static double calculateSine(double degree) {
        return Math.sin(toRadians(degree));
    }

    public static double calculateCosine(double degree) {
        return Math.cos(toRadians(degree));
    }

    public static double calculateTangent(double degree) {
        return Math.tan(toRadians(degree));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double degree = scanner.nextDouble();

        System.out.println("sin(" + degree + "): " + calculateSine(degree));
        System.out.println("cos(" + degree + "): " + calculateCosine(degree));
        System.out.println("tan(" + degree + "): " + calculateTangent(degree));
        scanner.close();
    }
}
