package com.gla.array;

import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int limit = readPositiveInt(sc, "Enter the range limit: ");
            String[] results = new String[limit];

            for (int i = 1; i <= limit; i++) {
                boolean multipleOfThree = i % 3 == 0;
                boolean multipleOfFive = i % 5 == 0;
                String value;
                if (multipleOfThree && multipleOfFive) {
                    value = "FizzBuzz";
                } else if (multipleOfThree) {
                    value = "Fizz";
                } else if (multipleOfFive) {
                    value = "Buzz";
                } else {
                    value = Integer.toString(i);
                }
                results[i - 1] = value;
            }

            for (int i = 0; i < results.length; i++) {
                int position = i + 1;
                System.out.println(position + " -> " + results[i]);
            }
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
                System.out.println("Enter a positive integer.");
                continue;
            }
            return value;
        }
    }
}

