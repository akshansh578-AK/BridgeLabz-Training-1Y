package com.gla.methods.level2;

import java.util.Scanner;

public class BMITracker {
    public static double calculateBmi(double weightKg, double heightMeters) {
        return weightKg / (heightMeters * heightMeters);
    }

    public static String bmiCategory(double bmi) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int count = scanner.nextInt();
        double[] bmiArray = new double[count];

        for (int index = 0; index < count; index++) {
            System.out.print("Enter weight (kg): ");
            double weight = scanner.nextDouble();
            System.out.print("Enter height (m): ");
            double height = scanner.nextDouble();
            bmiArray[index] = calculateBmi(weight, height);
        }

        for (int index = 0; index < count; index++) {
            System.out.println("BMI[" + index + "] = " + bmiArray[index] + " (" + bmiCategory(bmiArray[index]) + ")");
        }
        scanner.close();
    }
}
