package com.gla.methods.level1;

import java.util.Scanner;

public class PositiveNegativeZeroChecker {
    public static String classifyNumber(int number) {
        if (number > 0) {
            return "Positive";
        }
        if (number < 0) {
            return "Negative";
        }
        return "Zero";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Classification: " + classifyNumber(number));
        scanner.close();
    }
}
