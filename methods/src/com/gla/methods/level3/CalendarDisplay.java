package com.gla.methods.level3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class CalendarDisplay {
    public static void displayMonthCalendar(int year, int month) {
        YearMonth yearMonth = YearMonth.of(year, month);
        LocalDate firstDate = yearMonth.atDay(1);
        DayOfWeek startDay = firstDate.getDayOfWeek();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        int offset = startDay.getValue() - 1;
        for (int index = 0; index < offset; index++) {
            System.out.print("    ");
        }

        int daysInMonth = yearMonth.lengthOfMonth();
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + offset) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        displayMonthCalendar(year, month);
        scanner.close();
    }
}
