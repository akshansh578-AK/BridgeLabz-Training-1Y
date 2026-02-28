package com.gla.methods.level3;

import java.util.Scanner;

public class FootballTeamHeightStats {
    public static double calculateMean(double[] heights) {
        double sum = 0;
        for (double height : heights) {
            sum += height;
        }
        return heights.length == 0 ? 0 : sum / heights.length;
    }

    public static double findShortest(double[] heights) {
        double shortest = heights[0];
        for (double height : heights) {
            shortest = Math.min(shortest, height);
        }
        return shortest;
    }

    public static double findTallest(double[] heights) {
        double tallest = heights[0];
        for (double height : heights) {
            tallest = Math.max(tallest, height);
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player count: ");
        int count = scanner.nextInt();
        double[] heights = new double[count];

        for (int index = 0; index < count; index++) {
            System.out.print("Enter height in cm: ");
            heights[index] = scanner.nextDouble();
        }

        System.out.println("Mean height: " + calculateMean(heights));
        System.out.println("Shortest: " + findShortest(heights));
        System.out.println("Tallest: " + findTallest(heights));
        scanner.close();
    }
}
