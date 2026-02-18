package com.gla.array;

import java.util.Scanner;

public class LargestSecondLargestDynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int initialCapacity = 5;
            int[] numbers = new int[initialCapacity];
            int count = 0;

            while (true) {
                int value = readInt(sc, "Enter a positive number (0 or negative to stop): ");
                if (value <= 0) {
                    break;
                }
                if (count == numbers.length) {
                    numbers = growArray(numbers);
                }
                numbers[count] = value;
                count++;
            }

            if (count == 0) {
                System.out.println("No positive numbers were entered.");
                return;
            }

            int largest;
            int secondLargest;
            if (count == 1) {
                largest = numbers[0];
                secondLargest = numbers[0];
            } else {
                int first = numbers[0];
                int second = numbers[1];
                largest = Math.max(first, second);
                secondLargest = Math.min(first, second);

                for (int i = 2; i < count; i++) {
                    int value = numbers[i];
                    if (value > largest) {
                        secondLargest = largest;
                        largest = value;
                    } else if (value > secondLargest) {
                        secondLargest = value;
                    }
                }
            }

            System.out.println("Largest number: " + largest);
            System.out.println("Second largest number: " + secondLargest);
        } finally {
            sc.close();
        }
    }

    private static int[] growArray(int[] source) {
        int newSize = source.length * 2;
        int[] target = new int[newSize];
        for (int i = 0; i < source.length; i++) {
            target[i] = source[i];
        }
        return target;
    }

    private static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (!sc.hasNextInt()) {
                String badInput = sc.next();
                System.out.println("Invalid input: " + badInput);
                continue;
            }
            return sc.nextInt();
        }
    }
}

