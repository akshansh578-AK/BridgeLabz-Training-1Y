package com.gla.string;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] values = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter value for index " + i + ": ");
            values[i] = scanner.nextInt();
        }

        System.out.print("Enter index to access: ");
        int index = scanner.nextInt();

        try {
            int value = values[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        scanner.close();
    }
}

