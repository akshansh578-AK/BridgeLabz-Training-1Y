package com.gla.array;

import java.util.Scanner;

public class LargestSecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String digitString = readDigitString(sc, "Enter a number (digits only): ");
            int length = digitString.length();
            int[] digits = new int[length];

            for (int i = 0; i < length; i++) {
                digits[i] = digitString.charAt(i) - '0';
            }

            int largest = -1;
            int secondLargest = -1;

            for (int i = 0; i < digits.length; i++) {
                int value = digits[i];
                if (value > largest) {
                    secondLargest = largest;
                    largest = value;
                } else if (value > secondLargest && value != largest) {
                    secondLargest = value;
                }
            }

            if (secondLargest == -1) {
                secondLargest = largest;
            }

            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);
        } finally {
            sc.close();
        }
    }

    private static String readDigitString(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = sc.next();
            boolean allDigits = true;
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (ch < '0' || ch > '9') {
                    allDigits = false;
                    break;
                }
            }
            if (!allDigits) {
                System.out.println("Enter digits only.");
                continue;
            }
            return input;
        }
    }
}

