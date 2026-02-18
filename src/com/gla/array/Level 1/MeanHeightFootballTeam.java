package com.gla.array;

import java.util.Scanner;

public class MeanHeightFootballTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int playerCount = 11;
            double[] heights = new double[playerCount];
            double sum = 0.0;

            for (int i = 0; i < playerCount; i++) {
                String prompt = "Enter height for player " + (i + 1) + " (in meters): ";
                double height = readPositiveDouble(sc, prompt);
                heights[i] = height;
                sum += height;
            }

            double meanHeight = sum / playerCount;
            System.out.printf("Mean height: %.2f meters%n", meanHeight);
        } finally {
            sc.close();
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
                System.out.println("Enter a positive value.");
                continue;
            }
            return value;
        }
    }
}

