package com.gla.string;

import java.util.Scanner;

public class CharacterTypeDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        displayCharacterTypes(text);
        scanner.close();
    }

    private static void displayCharacterTypes(String text) {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            String type;
            if (Character.isLetter(c)) {
                type = "Letter";
            } else if (Character.isDigit(c)) {
                type = "Digit";
            } else if (Character.isWhitespace(c)) {
                type = "Whitespace";
            } else {
                type = "Other";
            }
            System.out.println("'" + c + "' -> " + type);
        }
    }
}

