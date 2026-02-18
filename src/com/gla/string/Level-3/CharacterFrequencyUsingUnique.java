package com.gla.string;

import java.util.Scanner;

public class CharacterFrequencyUsingUnique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        String unique = uniqueCharacters(text);
        for (int i = 0; i < unique.length(); i++) {
            char c = unique.charAt(i);
            int count = countOccurrences(text, c);
            System.out.println(c + " : " + count);
        }
        scanner.close();
    }

    private static String uniqueCharacters(String text) {
        boolean[] seen = new boolean[65536];
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!seen[c]) {
                seen[c] = true;
                builder.append(c);
            }
        }
        return builder.toString();
    }

    private static int countOccurrences(String text, char target) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}

