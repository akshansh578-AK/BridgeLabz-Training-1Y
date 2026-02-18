package com.gla.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplitTextWithoutSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.print("Enter delimiter character: ");
        String delimiterInput = scanner.nextLine();
        char delimiter = delimiterInput.isEmpty() ? ' ' : delimiterInput.charAt(0);

        String[] parts = splitManual(text, delimiter);
        System.out.println("Split parts:");
        for (String part : parts) {
            System.out.println(part);
        }
        scanner.close();
    }

    private static String[] splitManual(String text, char delimiter) {
        List<String> parts = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == delimiter) {
                parts.add(current.toString());
                current.setLength(0);
            } else {
                current.append(c);
            }
        }
        parts.add(current.toString());
        return parts.toArray(new String[0]);
    }
}

