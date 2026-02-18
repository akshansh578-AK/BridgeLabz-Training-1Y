package com.gla.string;

import java.util.Scanner;

public class StringLengthWithoutLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        int length = lengthWithoutLength(text);
        System.out.println("Length: " + length);
        scanner.close();
    }

    private static int lengthWithoutLength(String text) {
        int count = 0;
        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }
}

