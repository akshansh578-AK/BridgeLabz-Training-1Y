package com.gla.string;

import java.util.Scanner;

public class MonthlyCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Enter month (1-12): ");
        int month = Integer.parseInt(scanner.nextLine().trim());

        if (month < 1 || month > 12) {
            System.out.println("Invalid month.");
            scanner.close();
            return;
        }

        printCalendar(year, month);
        scanner.close();
    }

    private static void printCalendar(int year, int month) {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        int days = daysInMonth(year, month);
        int firstDay = dayOfWeek(year, month, 1);

        System.out.println(months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static int dayOfWeek(int year, int month, int day) {
        int m = month;
        int y = year;
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        int k = y % 100;
        int j = y / 100;
        int h = (day + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        int d = (h + 6) % 7;
        return d;
    }

    private static int daysInMonth(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0;
        }
    }

    private static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }
}

