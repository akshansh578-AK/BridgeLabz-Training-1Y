package com.gla.string;

import java.util.Scanner;

public class LowerCaseConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        String manual = toLowerCaseManual(text);
        String builtIn = text.toLowerCase();

        System.out.println("Manual lowercase: " + manual);
        System.out.println("Built-in lowercase: " + builtIn);
        System.out.println("Are both equal: " + manual.equals(builtIn));
        scanner.close();
    }

    private static String toLowerCaseManual(String text) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + ('a' - 'A'));
            }
            builder.append(c);
        }
        return builder.toString();
    }
}

