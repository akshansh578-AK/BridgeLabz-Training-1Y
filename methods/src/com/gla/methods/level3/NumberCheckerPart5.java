package com.gla.methods.level3;

import java.util.Scanner;

public class NumberCheckerPart5 {
    public static int sumOfProperDivisors(int number) {
        int sum = 0;
        for (int divisor = 1; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                sum += divisor;
            }
        }
        return sum;
    }

    public static boolean isPerfect(int number) {
        return number > 1 && sumOfProperDivisors(number) == number;
    }

    public static boolean isAbundant(int number) {
        return sumOfProperDivisors(number) > number;
    }

    public static boolean isDeficient(int number) {
        return sumOfProperDivisors(number) < number;
    }

    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static int factorial(int number) {
        int result = 1;
        for (int value = 2; value <= number; value++) {
            result *= value;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        System.out.println("Perfect: " + isPerfect(number));
        System.out.println("Abundant: " + isAbundant(number));
        System.out.println("Deficient: " + isDeficient(number));
        System.out.println("Strong number: " + isStrongNumber(number));
        scanner.close();
    }
}
