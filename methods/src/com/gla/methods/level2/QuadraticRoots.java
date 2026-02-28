package com.gla.methods.level2;

import java.util.Scanner;

public class QuadraticRoots {
    public static double calculateDiscriminant(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }

    public static void displayRoots(double a, double b, double c) {
        double discriminant = calculateDiscriminant(a, b, c);
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and distinct: " + root1 + ", " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal: " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are complex: " + realPart + " ± " + imaginaryPart + "i");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Coefficient a cannot be zero for a quadratic equation.");
        } else {
            displayRoots(a, b, c);
        }
        scanner.close();
    }
}
