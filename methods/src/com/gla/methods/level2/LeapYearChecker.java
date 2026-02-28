package com.gla.methods.level2;

import java.util.Scanner;

public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        System.out.println("Leap year: " + isLeapYear(year));
        scanner.close();
    }
}
