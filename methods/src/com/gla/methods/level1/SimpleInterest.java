package com.gla.methods.level1;

import java.util.Scanner;

public class SimpleInterest {
    // Computes simple interest using formula (P * R * T) / 100.
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100.0;
    }

    public static double calculateTotalAmount(double principal, double interest) {
        return principal + interest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter annual rate (%): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter time (years): ");
        double time = scanner.nextDouble();

        double interest = calculateSimpleInterest(principal, rate, time);
        double totalAmount = calculateTotalAmount(principal, interest);

        System.out.println("Simple Interest: " + interest);
        System.out.println("Total Amount: " + totalAmount);
        scanner.close();
    }
}
