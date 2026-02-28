package com.gla.methods.level1;

import java.util.Scanner;

public class SmallestLargestFinder {
    public static int findSmallest(int first, int second, int third) {
        return Math.min(first, Math.min(second, third));
    }

    public static int findLargest(int first, int second, int third) {
        return Math.max(first, Math.max(second, third));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second = scanner.nextInt();
        System.out.print("Enter third number: ");
        int third = scanner.nextInt();

        System.out.println("Smallest: " + findSmallest(first, second, third));
        System.out.println("Largest: " + findLargest(first, second, third));
        scanner.close();
    }
}
