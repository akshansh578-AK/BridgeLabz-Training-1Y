package com.gla.array;

import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String digitString = readDigitString(sc, "Enter a number (digits only): ");
            int length = digitString.length();
            int[] digits = new int[length];

            for (int i = 0; i < length; i++) {
                digits[i] = digitString.charAt(i) - '0';
            }

            StringBuilder reversed = new StringBuilder();
            for (int i = digits.length - 1; i >= 0; i--) {
                reversed.append(digits[i]);
            }

            System.out.println("Reversed number: " + reversed);
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

