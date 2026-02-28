package com.gla.methods.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactorsOperations {
    public static int[] getFactorsArray(int number) {
        List<Integer> factors = new ArrayList<>();
        for (int divisor = 1; divisor <= number; divisor++) {
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

    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static long productFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static int sumOfSquaresFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor * factor;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        int[] factors = getFactorsArray(number);

        System.out.println("Factors count: " + factors.length);
        System.out.println("Sum: " + sumFactors(factors));
        System.out.println("Product: " + productFactors(factors));
        System.out.println("Sum of squares: " + sumOfSquaresFactors(factors));
        scanner.close();
    }
}
