package com.gla;

import java.util.Scanner;

public class MultipleCatchArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers;

        try {
            System.out.print("Enter array size (-1 for null array): ");
            int size = scanner.nextInt();

            if (size == -1) {
                numbers = null;
            } else {
                numbers = new int[size];
                System.out.println("Enter " + size + " integer values:");
                for (int i = 0; i < size; i++) {
                    numbers[i] = scanner.nextInt();
                }
            }

            System.out.print("Enter index to retrieve value: ");
            int index = scanner.nextInt();

            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } finally {
            scanner.close();
        }
    }
}
