package com.gla.methods.level1;

import java.util.Scanner;

public class QuotientRemainder {
    public static int findQuotient(int dividend, int divisor) {
        return dividend / divisor;
    }

    public static int findRemainder(int dividend, int divisor) {
        return dividend % divisor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int dividend = scanner.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("Divisor cannot be zero.");
        } else {
            System.out.println("Quotient: " + findQuotient(dividend, divisor));
            System.out.println("Remainder: " + findRemainder(dividend, divisor));
        }
        scanner.close();
    }
}
