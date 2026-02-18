package com.gla.array;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int studentCount = 10;
            int[] ages = new int[studentCount];
            int eligibilityAge = 18;

            for (int i = 0; i < studentCount; i++) {
                String prompt = "Enter age for student " + (i + 1) + ": ";
                ages[i] = readNonNegativeInt(sc, prompt);
            }

            for (int i = 0; i < studentCount; i++) {
                String status = ages[i] >= eligibilityAge ? "Eligible" : "Not Eligible";
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") -> " + status);
            }
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
                System.out.println("Invalid age. Enter a non-negative integer.");
                continue;
            }
            return value;
        }
    }
}

