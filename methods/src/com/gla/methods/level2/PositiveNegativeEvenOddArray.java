package com.gla.methods.level2;

import java.util.Scanner;

public class PositiveNegativeEvenOddArray {
    public static int countPositive(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number > 0) {
                count++;
            }
        }
        return count;
    }

    public static int countNegative(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number < 0) {
                count++;
            }
        }
        return count;
    }

    public static int countEven(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countOdd(int[] numbers) {
        return numbers.length - countEven(numbers);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int index = 0; index < size; index++) {
            System.out.print("Enter number: ");
            numbers[index] = scanner.nextInt();
        }

        System.out.println("Positive count: " + countPositive(numbers));
        System.out.println("Negative count: " + countNegative(numbers));
        System.out.println("Even count: " + countEven(numbers));
        System.out.println("Odd count: " + countOdd(numbers));
        scanner.close();
    }
}
