package com.gla.string;

import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        try {
            String result = safeSubstring(text, start, end);
            System.out.println("Substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
        scanner.close();
    }

    private static String safeSubstring(String text, int start, int end) {
        if (start > end) {
            text.substring(end, start);
            throw new IllegalArgumentException("Start index cannot be greater than end index");
        }
        return text.substring(start, end);
    }
}

