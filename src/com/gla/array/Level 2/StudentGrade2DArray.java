package com.gla.array;

import java.util.Scanner;

public class StudentGrade2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int studentCount = readPositiveInt(sc, "Enter number of students: ");
            int subjectCount = 3;
            double[][] marks = new double[studentCount][subjectCount];
            double[] percentages = new double[studentCount];
            String[] grades = new String[studentCount];

            for (int i = 0; i < studentCount; i++) {
                marks[i][0] = readScore(sc, "Enter Physics marks for student " + (i + 1) + ": ");
                marks[i][1] = readScore(sc, "Enter Chemistry marks for student " + (i + 1) + ": ");
                marks[i][2] = readScore(sc, "Enter Math marks for student " + (i + 1) + ": ");

                double total = marks[i][0] + marks[i][1] + marks[i][2];
                double percent = total / subjectCount;
                percentages[i] = percent;
                grades[i] = getGrade(percent);
            }

            for (int i = 0; i < studentCount; i++) {
                System.out.printf("Student %d -> P: %.2f, C: %.2f, M: %.2f, Percentage: %.2f, Grade: %s%n",
                        (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
            }
        } finally {
            sc.close();
        }
    }

    private static String getGrade(double percent) {
        if (percent >= 90) {
            return "A";
        }
        if (percent >= 80) {
            return "B";
        }
        if (percent >= 70) {
            return "C";
        }
        if (percent >= 60) {
            return "D";
        }
        if (percent >= 50) {
            return "E";
        }
        return "F";
    }

    private static double readScore(Scanner sc, String prompt) {
        double min = 0.0;
        double max = 100.0;
        while (true) {
            System.out.print(prompt);
            if (!sc.hasNextDouble()) {
                String badInput = sc.next();
                System.out.println("Invalid input: " + badInput);
                continue;
            }
            double value = sc.nextDouble();
            if (value < min || value > max) {
                System.out.println("Enter marks between 0 and 100.");
                continue;
            }
            return value;
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

