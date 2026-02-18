package com.gla.array;

import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int count = 5;
            int[] numbers = new int[count];

            for (int i = 0; i < count; i++) {
                String prompt = "Enter number " + (i + 1) + ": ";
                numbers[i] = readInt(sc, prompt);
            }

            for (int i = 0; i < count; i++) {
                int value = numbers[i];
                if (value > 0) {
                    String parity = value % 2 == 0 ? "Even" : "Odd";
                    System.out.println(value + " is Positive and " + parity);
                } else if (value < 0) {
                    System.out.println(value + " is Negative");
                } else {
                    System.out.println(value + " is Zero");
                }
            }

            int first = numbers[0];
            int last = numbers[count - 1];
            if (first > last) {
                System.out.println("First element is greater than last element.");
            } else if (first < last) {
                System.out.println("Last element is greater than first element.");
            } else {
                System.out.println("First and last elements are equal.");
            }
        } finally {
            sc.close();
        }
    }

    private static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (!sc.hasNextInt()) {
                String badInput = sc.next();
                System.out.println("Invalid input: " + badInput);
                continue;
            }
            return sc.nextInt();
        }
    }
}

