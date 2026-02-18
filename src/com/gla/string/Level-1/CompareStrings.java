package com.gla.string;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String first = scanner.nextLine();
        System.out.print("Enter second string: ");
        String second = scanner.nextLine();

        boolean charAtResult = compareUsingCharAt(first, second);
        boolean equalsResult = first.equals(second);

        System.out.println("Comparison using charAt: " + charAtResult);
        System.out.println("Comparison using equals: " + equalsResult);
        scanner.close();
    }

    private static boolean compareUsingCharAt(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

