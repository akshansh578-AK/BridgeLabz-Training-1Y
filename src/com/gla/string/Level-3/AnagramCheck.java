package com.gla.string;

import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first text: ");
        String first = scanner.nextLine();
        System.out.print("Enter second text: ");
        String second = scanner.nextLine();

        boolean result = areAnagrams(first, second);
        System.out.println("Are anagrams: " + result);
        scanner.close();
    }

    private static boolean areAnagrams(String first, String second) {
        String cleanedFirst = cleanText(first);
        String cleanedSecond = cleanText(second);
        if (cleanedFirst.length() != cleanedSecond.length()) {
            return false;
        }
        int[] counts = new int[256];
        for (int i = 0; i < cleanedFirst.length(); i++) {
            counts[cleanedFirst.charAt(i)]++;
            counts[cleanedSecond.charAt(i)]--;
        }
        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    private static String cleanText(String text) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!Character.isWhitespace(c)) {
                builder.append(Character.toLowerCase(c));
            }
        }
        return builder.toString();
    }
}

