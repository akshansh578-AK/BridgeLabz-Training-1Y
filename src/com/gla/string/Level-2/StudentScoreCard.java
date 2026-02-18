package com.gla.string;

import java.util.Scanner;

public class StudentScoreCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int count = Integer.parseInt(scanner.nextLine().trim());

        String[] names = new String[count];
        int[][] scores = new int[count][3];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter student name: ");
            names[i] = scanner.nextLine().trim();
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter score for subject " + (j + 1) + ": ");
                scores[i][j] = Integer.parseInt(scanner.nextLine().trim());
            }
        }

        displayScoreCard(names, scores);
        scanner.close();
    }

    private static void displayScoreCard(String[] names, int[][] scores) {
        for (int i = 0; i < names.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            String grade = gradeFromAverage(average);

            System.out.println("Student: " + names[i]);
            System.out.println("Total: " + total);
            System.out.println("Average: " + average);
            System.out.println("Grade: " + grade);
        }
    }

    private static String gradeFromAverage(double average) {
        if (average >= 90) {
            return "A";
        }
        if (average >= 80) {
            return "B";
        }
        if (average >= 70) {
            return "C";
        }
        if (average >= 60) {
            return "D";
        }
        return "F";
    }
}

