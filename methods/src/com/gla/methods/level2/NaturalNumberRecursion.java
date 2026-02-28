package com.gla.methods.level2;

import java.util.Scanner;

public class NaturalNumberRecursion {
    public static int sumUsingRecursion(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumUsingRecursion(n - 1);
    }

    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        System.out.println("Recursion sum: " + sumUsingRecursion(n));
        System.out.println("Formula sum: " + sumUsingFormula(n));
        scanner.close();
    }
}
