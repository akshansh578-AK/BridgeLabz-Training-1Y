package com.gla.methods.level1;

import java.util.Scanner;

public class TriangularParkRounds {
    public static double calculatePerimeter(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }

    public static int calculateRounds(double totalDistance, double perimeter) {
        return (int) Math.ceil(totalDistance / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side A: ");
        double sideA = scanner.nextDouble();
        System.out.print("Enter side B: ");
        double sideB = scanner.nextDouble();
        System.out.print("Enter side C: ");
        double sideC = scanner.nextDouble();
        System.out.print("Enter distance to cover: ");
        double totalDistance = scanner.nextDouble();

        double perimeter = calculatePerimeter(sideA, sideB, sideC);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Required rounds: " + calculateRounds(totalDistance, perimeter));
        scanner.close();
    }
}
