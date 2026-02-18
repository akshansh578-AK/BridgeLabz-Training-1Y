package com.gla.string;

import java.util.Scanner;

public class CharacterFrequencyASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        int[] counts = countAsciiFrequencies(text);
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println(i + " '" + (char) i + "' : " + counts[i]);
            }
        }
        scanner.close();
    }

    private static int[] countAsciiFrequencies(String text) {
        int[] counts = new int[128];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < 128) {
                counts[c]++;
            }
        }
        return counts;
    }
}

