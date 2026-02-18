package com.gla.string;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        String unique = uniqueCharacters(text);
        System.out.println("Unique characters: " + unique);
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
}

