package com.gla.methods.level3;

import java.util.Scanner;

public class StudentScoreCard {
    public static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return marks.length == 0 ? 0 : (double) sum / marks.length;
    }

    public static String findGrade(double average) {
        if (average >= 90) {
            return "A";
        }
        if (average >= 75) {
            return "B";
        }
        if (average >= 60) {
            return "C";
        }
        if (average >= 40) {
            return "D";
        }
        return "F";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int count = scanner.nextInt();
        int[] marks = new int[count];

        for (int index = 0; index < count; index++) {
            System.out.print("Enter mark: ");
            marks[index] = scanner.nextInt();
        }

        double average = calculateAverage(marks);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + findGrade(average));
        scanner.close();
    }
}
