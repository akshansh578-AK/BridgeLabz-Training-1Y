package com.gla.array;

import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int employeeCount = readPositiveInt(sc, "Enter number of employees: ");
            double[] salaries = new double[employeeCount];
            int[] yearsOfService = new int[employeeCount];
            double[] bonuses = new double[employeeCount];
            double[] newSalaries = new double[employeeCount];

            double bonusRateAboveFive = 0.05;
            double bonusRateBelowOrEqualFive = 0.02;
            double totalBonus = 0.0;
            double totalOldSalary = 0.0;
            double totalNewSalary = 0.0;

            for (int i = 0; i < employeeCount; i++) {
                String salaryPrompt = "Enter salary for employee " + (i + 1) + ": ";
                String yearsPrompt = "Enter years of service for employee " + (i + 1) + ": ";
                double salary = readNonNegativeDouble(sc, salaryPrompt);
                int years = readNonNegativeInt(sc, yearsPrompt);

                double rate = years > 5 ? bonusRateAboveFive : bonusRateBelowOrEqualFive;
                double bonus = salary * rate;
                double newSalary = salary + bonus;

                salaries[i] = salary;
                yearsOfService[i] = years;
                bonuses[i] = bonus;
                newSalaries[i] = newSalary;

                totalOldSalary += salary;
                totalBonus += bonus;
                totalNewSalary += newSalary;
            }

            for (int i = 0; i < employeeCount; i++) {
                System.out.printf("Employee %d -> Salary: %.2f, Years: %d, Bonus: %.2f, New Salary: %.2f%n",
                        (i + 1), salaries[i], yearsOfService[i], bonuses[i], newSalaries[i]);
            }

            System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
            System.out.printf("Total Bonus: %.2f%n", totalBonus);
            System.out.printf("Total New Salary: %.2f%n", totalNewSalary);
        } finally {
            sc.close();
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
                System.out.println("Enter a non-negative integer.");
                continue;
            }
            return value;
        }
    }

    private static double readNonNegativeDouble(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (!sc.hasNextDouble()) {
                String badInput = sc.next();
                System.out.println("Invalid input: " + badInput);
                continue;
            }
            double value = sc.nextDouble();
            if (value < 0) {
                System.out.println("Enter a non-negative number.");
                continue;
            }
            return value;
        }
    }
}

