package com.gla.array;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String digitString = readDigitString(sc, "Enter a number (digits only): ");
            int[] frequency = new int[10];

            for (int i = 0; i < digitString.length(); i++) {
                int digit = digitString.charAt(i) - '0';
                frequency[digit]++;
            }

            for (int i = 0; i < frequency.length; i++) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
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

