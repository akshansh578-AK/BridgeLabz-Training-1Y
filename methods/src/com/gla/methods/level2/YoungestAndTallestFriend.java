package com.gla.methods.level2;

import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static int findYoungestIndex(int[] ages) {
        int youngestIndex = 0;
        for (int index = 1; index < ages.length; index++) {
            if (ages[index] < ages[youngestIndex]) {
                youngestIndex = index;
            }
        }
        return youngestIndex;
    }

    public static int findTallestIndex(double[] heights) {
        int tallestIndex = 0;
        for (int index = 1; index < heights.length; index++) {
            if (heights[index] > heights[tallestIndex]) {
                tallestIndex = index;
            }
        }
        return tallestIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[3];
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int index = 0; index < 3; index++) {
            System.out.print("Enter friend name: ");
            names[index] = scanner.next();
            System.out.print("Enter age: ");
            ages[index] = scanner.nextInt();
            System.out.print("Enter height in cm: ");
            heights[index] = scanner.nextDouble();
        }

        int youngestIndex = findYoungestIndex(ages);
        int tallestIndex = findTallestIndex(heights);

        System.out.println("Youngest friend: " + names[youngestIndex]);
        System.out.println("Tallest friend: " + names[tallestIndex]);
        scanner.close();
    }
}
