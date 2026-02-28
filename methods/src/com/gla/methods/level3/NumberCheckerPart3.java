package com.gla.methods.level3;

import java.util.Arrays;
import java.util.Scanner;

public class NumberCheckerPart3 {
    public static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10 + (number % 10);
            number /= 10;
        }
        return original == reverse;
    }

    public static int[] reverseArray(int[] values) {
        int[] reversed = values.clone();
        for (int left = 0, right = reversed.length - 1; left < right; left++, right--) {
            int temp = reversed[left];
            reversed[left] = reversed[right];
            reversed[right] = temp;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number for palindrome check: ");
        int number = scanner.nextInt();

        int[] sample = {1, 2, 3, 4, 5};
        System.out.println("Palindrome number: " + isPalindrome(number));
        System.out.println("Reversed array: " + Arrays.toString(reverseArray(sample)));
        scanner.close();
    }
}
