package com.gla.methods.level3;

import java.util.Scanner;

public class NumberCheckerPart2 {
    public static boolean isHarshadNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum != 0 && number % sum == 0;
    }

    public static int digitFrequency(int number, int digit) {
        int count = 0;
        int temp = Math.abs(number);
        while (temp > 0) {
            if (temp % 10 == digit) {
                count++;
            }
            temp /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.print("Enter digit to count: ");
        int digit = scanner.nextInt();

        System.out.println("Harshad number: " + isHarshadNumber(number));
        System.out.println("Digit frequency: " + digitFrequency(number, digit));
        scanner.close();
    }
}
