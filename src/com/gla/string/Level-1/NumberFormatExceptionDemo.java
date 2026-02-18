package com.gla.string;

import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number string: ");
        String input = scanner.nextLine();

        try {
            int value = Integer.parseInt(input);
            System.out.println("Parsed value: " + value);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
        scanner.close();
    }
}

