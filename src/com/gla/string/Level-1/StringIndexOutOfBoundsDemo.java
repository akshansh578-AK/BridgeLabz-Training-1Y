package com.gla.string;

import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        System.out.print("Enter index to access: ");
        int index = scanner.nextInt();

        try {
            char value = text.charAt(index);
            System.out.println("Character at index " + index + ": " + value);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
        scanner.close();
    }
}

