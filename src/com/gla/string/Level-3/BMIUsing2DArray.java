package com.gla.string;

import java.util.Scanner;

public class BMIUsing2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int count = Integer.parseInt(scanner.nextLine().trim());

        String[] names = new String[count];
        double[][] measurements = new double[count][2];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter name: ");
            names[i] = scanner.nextLine().trim();
            System.out.print("Enter weight in kg: ");
            measurements[i][0] = Double.parseDouble(scanner.nextLine().trim());
            System.out.print("Enter height in meters: ");
            measurements[i][1] = Double.parseDouble(scanner.nextLine().trim());
        }

        displayBmiReport(names, measurements);
        scanner.close();
    }

    private static void displayBmiReport(String[] names, double[][] measurements) {
        for (int i = 0; i < names.length; i++) {
            double weight = measurements[i][0];
            double height = measurements[i][1];
            double bmi = calculateBmi(weight, height);
            String category = bmiCategory(bmi);
            System.out.println("Name: " + names[i]);
            System.out.println("BMI: " + bmi);
            System.out.println("Category: " + category);
        }
    }

    private static double calculateBmi(double weight, double height) {
        if (height <= 0) {
            return 0;
        }
        return weight / (height * height);
    }

    private static String bmiCategory(double bmi) {
        if (bmi == 0) {
            return "Invalid";
        }
        if (bmi < 18.5) {
            return "Underweight";
        }
        if (bmi < 25) {
            return "Normal";
        }
        if (bmi < 30) {
            return "Overweight";
        }
        return "Obese";
    }
}

