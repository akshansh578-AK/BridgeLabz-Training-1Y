package com.gla.methods.level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactorsAdvancedOperations {
    public static int[] properFactors(int number) {
        List<Integer> factors = new ArrayList<>();
        for (int divisor = 1; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                factors.add(divisor);
            }
        }
        int[] result = new int[factors.size()];
        for (int index = 0; index < factors.size(); index++) {
            result[index] = factors.get(index);
        }
        return result;
    }

    public static int gcd(int first, int second) {
        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }
        return Math.abs(first);
    }

    public static int lcm(int first, int second) {
        return Math.abs(first * second) / gcd(first, second);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        int[] factors = properFactors(first);
        System.out.println("Proper factors count of first number: " + factors.length);
        System.out.println("GCD: " + gcd(first, second));
        System.out.println("LCM: " + lcm(first, second));
        scanner.close();
    }
}
