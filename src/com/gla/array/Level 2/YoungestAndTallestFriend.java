package com.gla.array;

import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String name1 = "Amar";
            String name2 = "Akbar";
            String name3 = "Anthony";
            String[] names = new String[] { name1, name2, name3 };

            int friendCount = names.length;
            int[] ages = new int[friendCount];
            double[] heights = new double[friendCount];

            for (int i = 0; i < friendCount; i++) {
                String agePrompt = "Enter age for " + names[i] + ": ";
                String heightPrompt = "Enter height for " + names[i] + " (in meters): ";
                ages[i] = readNonNegativeInt(sc, agePrompt);
                heights[i] = readPositiveDouble(sc, heightPrompt);
            }

            int youngestIndex = 0;
            int tallestIndex = 0;
            for (int i = 1; i < friendCount; i++) {
                if (ages[i] < ages[youngestIndex]) {
                    youngestIndex = i;
                }
                if (heights[i] > heights[tallestIndex]) {
                    tallestIndex = i;
                }
            }

            System.out.println("Youngest: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
            System.out.println("Tallest: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " meters)");
        } finally {
            sc.close();
        }
    }

    private static int readNonNegativeInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (!sc.hasNextInt()) {
                String badInput = sc.next();
                System.out.println("Invalid input: " + badInput);
                continue;
            }
            int value = sc.nextInt();
            if (value < 0) {
                System.out.println("Enter a non-negative integer.");
                continue;
            }
            return value;
        }
    }

    private static double readPositiveDouble(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (!sc.hasNextDouble()) {
                String badInput = sc.next();
                System.out.println("Invalid input: " + badInput);
                continue;
            }
            double value = sc.nextDouble();
            if (value <= 0) {
                System.out.println("Enter a positive number.");
                continue;
            }
            return value;
        }
    }
}

