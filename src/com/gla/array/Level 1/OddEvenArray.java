package com.gla.array;

import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int limit = readPositiveInt(sc, "Enter a natural number: ");
            int[] oddNumbers = new int[limit];
            int[] evenNumbers = new int[limit];
            int oddCount = 0;
            int evenCount = 0;

            for (int i = 1; i <= limit; i++) {
                if (i % 2 == 0) {
                    evenNumbers[evenCount] = i;
                    evenCount++;
                } else {
                    oddNumbers[oddCount] = i;
                    oddCount++;
                }
            }

            System.out.println("Odd numbers:");
            for (int i = 0; i < oddCount; i++) {
                System.out.print(oddNumbers[i]);
                if (i < oddCount - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();

            System.out.println("Even numbers:");
            for (int i = 0; i < evenCount; i++) {
                System.out.print(evenNumbers[i]);
                if (i < evenCount - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        } finally {
            sc.close();
        }
    }

    private static int readPositiveInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (!sc.hasNextInt()) {
                String badInput = sc.next();
                System.out.println("Invalid input: " + badInput);
                continue;
            }
            int value = sc.nextInt();
            if (value <= 0) {
                System.out.println("Enter a natural number greater than 0.");
                continue;
            }
            return value;
        }
    }
}

