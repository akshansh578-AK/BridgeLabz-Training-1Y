package com.gla.string;

import java.util.Arrays;
import java.util.Scanner;

public class CharactersArrayComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        char[] manual = toCharArrayManual(text);
        char[] builtIn = text.toCharArray();

        System.out.println("Manual array: " + Arrays.toString(manual));
        System.out.println("Built-in array: " + Arrays.toString(builtIn));
        System.out.println("Arrays are equal: " + Arrays.equals(manual, builtIn));
        scanner.close();
    }

    private static char[] toCharArrayManual(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }
}

