package com.gla.methods.level3;

import java.util.Scanner;

public class NumberCheckerPart1 {
    public static boolean isDuckNumber(int number) {
        String value = String.valueOf(number);
        return value.length() > 1 && value.substring(1).contains("0");
    }

    public static boolean isArmstrongNumber(int number) {
        int digits = String.valueOf(number).length();
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == number;
    }

    public static int[] largestAndSecondLargest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number for duck/armstrong check: ");
        int number = scanner.nextInt();

        System.out.println("Duck number: " + isDuckNumber(number));
        System.out.println("Armstrong number: " + isArmstrongNumber(number));

        int[] sample = {12, 44, 7, 99, 63};
        int[] result = largestAndSecondLargest(sample);
        System.out.println("Largest: " + result[0] + ", Second largest: " + result[1]);
        scanner.close();
    }
}
