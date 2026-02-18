package com.gla.string;

import java.util.Scanner;

public class SubstringUsingCharAt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        if (start < 0 || end > text.length() || start > end) {
            System.out.println("Invalid start or end index.");
        } else {
            String manual = substringUsingCharAt(text, start, end);
            String builtIn = text.substring(start, end);
            System.out.println("Substring using charAt: " + manual);
            System.out.println("Substring using substring(): " + builtIn);
            System.out.println("Are both equal: " + manual.equals(builtIn));
        }
        scanner.close();
    }

    private static String substringUsingCharAt(String text, int start, int end) {
        StringBuilder builder = new StringBuilder();
        for (int i = start; i < end; i++) {
            builder.append(text.charAt(i));
        }
        return builder.toString();
    }
}

