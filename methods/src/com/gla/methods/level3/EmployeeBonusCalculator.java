package com.gla.methods.level3;

import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static double calculateBonus(double salary, int yearsOfService) {
        if (yearsOfService >= 10) {
            return salary * 0.20;
        }
        if (yearsOfService >= 5) {
            return salary * 0.10;
        }
        return salary * 0.05;
    }

    public static double calculateNetSalary(double salary, double bonus) {
        return salary + bonus;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter years of service: ");
        int years = scanner.nextInt();

        double bonus = calculateBonus(salary, years);
        System.out.println("Bonus: " + bonus);
        System.out.println("Net Salary: " + calculateNetSalary(salary, bonus));
        scanner.close();
    }
}
