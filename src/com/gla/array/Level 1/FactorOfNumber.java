package com.gla.array;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int number = readPositiveInt(sc, "Enter a positive number: ");
            int initialCapacity = 10;
            int[] factors = new int[initialCapacity];
            int count = 0;

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    if (count == factors.length) {
                        factors = growArray(factors);
                    }
                    factors[count] = i;
                    count++;
                }
            }

            System.out.println("Factors of " + number + ":");
            for (int i = 0; i < count; i++) {
                System.out.print(factors[i]);
                if (i < count - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        } finally {
            sc.close();
        }
    }

    private static int[] growArray(int[] source) {
        int newSize = source.length * 2;
        int[] target = new int[newSize];
        for (int i = 0; i < source.length; i++) {
            target[i] = source[i];
        }
        return target;
    }

    private static int readPositiveInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (!sc.hasNextInt()) {
                String badInput = sc.next();
                System.out.println("Invalid input: " + badInput);
                continue;
            }
            int value = sc.nextInt();
            if (value <= 0) {
                System.out.println("Enter a positive integer.");
                continue;
            }
            return value;
        }
    }
}

