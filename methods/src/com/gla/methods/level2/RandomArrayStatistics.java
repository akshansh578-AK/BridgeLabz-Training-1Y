package com.gla.methods.level2;

import java.util.Random;
import java.util.Scanner;

public class RandomArrayStatistics {
    public static int[] generateRandomArray(int size, int bound) {
        int[] numbers = new int[size];
        Random random = new Random();
        for (int index = 0; index < size; index++) {
            numbers[index] = random.nextInt(bound);
        }
        return numbers;
    }

    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return numbers.length == 0 ? 0 : (double) sum / numbers.length;
    }

    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            min = Math.min(min, number);
        }
        return min;
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            max = Math.max(max, number);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] numbers = generateRandomArray(size, 100);

        System.out.println("Average: " + calculateAverage(numbers));
        System.out.println("Minimum: " + findMin(numbers));
        System.out.println("Maximum: " + findMax(numbers));
        scanner.close();
    }
}
