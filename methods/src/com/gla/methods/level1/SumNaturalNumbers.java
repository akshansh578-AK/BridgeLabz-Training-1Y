package com.gla.methods.level1;

import java.util.Scanner;

public class SumNaturalNumbers {
    public static int sumUsingLoop(int n) {
        int sum = 0;
        for (int index = 1; index <= n; index++) {
            sum += index;
        }
        return sum;
    }

    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        System.out.println("Sum using loop: " + sumUsingLoop(n));
        System.out.println("Sum using formula: " + sumUsingFormula(n));
        scanner.close();
    }
}
