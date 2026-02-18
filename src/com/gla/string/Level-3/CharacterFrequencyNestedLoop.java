package com.gla.string;

import java.util.Scanner;

public class CharacterFrequencyNestedLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        printFrequencies(text);
        scanner.close();
    }

    private static void printFrequencies(String text) {
        String counted = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (alreadyCounted(counted, c)) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == c) {
                    count++;
                }
            }
            counted = counted + c;
            System.out.println(c + " : " + count);
        }
    }

    private static boolean alreadyCounted(String counted, char c) {
        for (int i = 0; i < counted.length(); i++) {
            if (counted.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }
}

