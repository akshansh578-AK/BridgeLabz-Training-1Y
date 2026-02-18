package com.gla.string;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        Character result = firstNonRepeating(text);
        if (result == null) {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character: " + result);
        }
        scanner.close();
    }

    private static Character firstNonRepeating(String text) {
        int[] counts = new int[65536];
        for (int i = 0; i < text.length(); i++) {
            counts[text.charAt(i)]++;
        }
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (counts[c] == 1) {
                return c;
            }
        }
        return null;
    }
}

