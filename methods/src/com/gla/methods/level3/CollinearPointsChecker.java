package com.gla.methods.level3;

import java.util.Scanner;

public class CollinearPointsChecker {
    public static boolean areCollinear(double x1, double y1, double x2, double y2, double x3, double y3) {
        double areaTwice = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return areaTwice == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1 y1 x2 y2 x3 y3: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        System.out.println("Collinear: " + areCollinear(x1, y1, x2, y2, x3, y3));
        scanner.close();
    }
}
