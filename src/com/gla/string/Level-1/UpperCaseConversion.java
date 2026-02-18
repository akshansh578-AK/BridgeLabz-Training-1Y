package com.gla.string;

import java.util.Scanner;

public class UpperCaseConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        String manual = toUpperCaseManual(text);
        String builtIn = text.toUpperCase();

        System.out.println("Manual uppercase: " + manual);
        System.out.println("Built-in uppercase: " + builtIn);
        System.out.println("Are both equal: " + manual.equals(builtIn));
        scanner.close();
    }

    private static String toUpperCaseManual(String text) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - ('a' - 'A'));
            }
            builder.append(c);
        }
        return builder.toString();
    }
}

