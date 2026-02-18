package com.gla.string;

import java.util.Scanner;

public class TrimSpacesUsingCharAt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = scanner.nextLine();

        String manual = trimManual(text);
        String builtIn = text.trim();

        System.out.println("Manual trim: " + manual);
        System.out.println("Built-in trim: " + builtIn);
        System.out.println("Are both equal: " + manual.equals(builtIn));
        scanner.close();
    }

    private static String trimManual(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start <= end && Character.isWhitespace(text.charAt(start))) {
            start++;
        }
        while (end >= start && Character.isWhitespace(text.charAt(end))) {
            end--;
        }
        if (start > end) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        for (int i = start; i <= end; i++) {
            builder.append(text.charAt(i));
        }
        return builder.toString();
    }
}

