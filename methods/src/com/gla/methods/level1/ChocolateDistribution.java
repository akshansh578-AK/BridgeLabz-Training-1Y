package com.gla.methods.level1;

import java.util.Scanner;

public class ChocolateDistribution {
    public static int chocolatesPerStudent(int totalChocolates, int students) {
        return totalChocolates / students;
    }

    public static int remainingChocolates(int totalChocolates, int students) {
        return totalChocolates % students;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total chocolates: ");
        int totalChocolates = scanner.nextInt();
        System.out.print("Enter number of students: ");
        int students = scanner.nextInt();

        if (students <= 0) {
            System.out.println("Students must be greater than zero.");
        } else {
            System.out.println("Chocolates per student: " + chocolatesPerStudent(totalChocolates, students));
            System.out.println("Remaining chocolates: " + remainingChocolates(totalChocolates, students));
        }
        scanner.close();
    }
}
