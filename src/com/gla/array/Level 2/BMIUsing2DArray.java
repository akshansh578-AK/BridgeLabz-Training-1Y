package com.gla.array;

import java.util.Scanner;

public class BMIUsing2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int count = readPositiveInt(sc, "Enter number of people: ");
            int columns = 3;
            double[][] data = new double[count][columns];
            String[] statuses = new String[count];

            for (int i = 0; i < count; i++) {
                String weightPrompt = "Enter weight for person " + (i + 1) + " (kg): ";
                String heightPrompt = "Enter height for person " + (i + 1) + " (m): ";
                double weight = readPositiveDouble(sc, weightPrompt);
                double height = readPositiveDouble(sc, heightPrompt);

                double bmi = weight / (height * height);
                data[i][0] = weight;
                data[i][1] = height;
                data[i][2] = bmi;
                statuses[i] = getBmiStatus(bmi);
            }

            for (int i = 0; i < count; i++) {
                System.out.printf("Person %d -> Weight: %.2f, Height: %.2f, BMI: %.2f, Status: %s%n",
                        (i + 1), data[i][0], data[i][1], data[i][2], statuses[i]);
            }
        } finally {
            sc.close();
        }
    }

    private static String getBmiStatus(double bmi) {
        double underweightLimit = 18.5;
        double normalLimit = 25.0;
        double overweightLimit = 30.0;

        if (bmi < underweightLimit) {
            return "Underweight";
        }
        if (bmi < normalLimit) {
            return "Normal";
        }
        if (bmi < overweightLimit) {
            return "Overweight";
        }
        return "Obese";
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

