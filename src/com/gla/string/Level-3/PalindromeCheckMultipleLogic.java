package com.gla.string;

import java.util.Scanner;

public class PalindromeCheckMultipleLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        boolean reverseCheck = isPalindromeByReverse(text);
        boolean twoPointerCheck = isPalindromeByTwoPointer(text);
        boolean recursiveCheck = isPalindromeByRecursion(text, 0, text.length() - 1);

        System.out.println("Reverse check: " + reverseCheck);
        System.out.println("Two-pointer check: " + twoPointerCheck);
        System.out.println("Recursive check: " + recursiveCheck);
        scanner.close();
    }

    private static boolean isPalindromeByReverse(String text) {
        StringBuilder builder = new StringBuilder(text);
        String reversed = builder.reverse().toString();
        return text.equals(reversed);
    }

    private static boolean isPalindromeByTwoPointer(String text) {
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isPalindromeByRecursion(String text, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (text.charAt(left) != text.charAt(right)) {
            return false;
        }
        return isPalindromeByRecursion(text, left + 1, right - 1);
    }
}

