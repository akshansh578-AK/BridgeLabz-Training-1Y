package com.gla.array;

import java.util.Scanner;

public class TwoDToOneDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int rows = readPositiveInt(sc, "Enter number of rows: ");
            int cols = readPositiveInt(sc, "Enter number of columns: ");

            int[][] matrix = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    String prompt = "Enter element at (" + (i + 1) + ", " + (j + 1) + "): ";
                    matrix[i][j] = readInt(sc, prompt);
                }
            }

            int total = rows * cols;
            int[] flat = new int[total];
            int index = 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    flat[index] = matrix[i][j];
                    index++;
                }
            }

            System.out.println("1D array:");
            for (int i = 0; i < flat.length; i++) {
                System.out.print(flat[i]);
                if (i < flat.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
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

