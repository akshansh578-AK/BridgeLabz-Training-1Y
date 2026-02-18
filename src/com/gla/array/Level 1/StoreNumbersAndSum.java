package com.gla.array;

import java.util.Scanner;

public class StoreNumbersAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int maxSize = 10;
            int[] numbers = new int[maxSize];
            int count = 0;
            int sum = 0;

            while (count < maxSize) {
                int value = readInt(sc, "Enter a number (0 or negative to stop): ");
                if (value <= 0) {
                    break;
                }
                numbers[count] = value;
                sum += value;
                count++;
            }

            if (count == 0) {
                System.out.println("No positive numbers were entered.");
            } else {
                System.out.println("Stored numbers:");
                for (int i = 0; i < count; i++) {
                    System.out.println(numbers[i]);
                }
                System.out.println("Total sum: " + sum);
            }
        } finally {
            sc.close();
        }
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

