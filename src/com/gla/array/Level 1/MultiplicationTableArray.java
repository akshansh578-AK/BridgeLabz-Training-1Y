package com.gla.array;

import java.util.Scanner;

public class MultiplicationTableArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int multiplierStart = 1;
            int multiplierEnd = 10;
            int size = multiplierEnd - multiplierStart + 1;
            int[] table = new int[size];

            int number = readInt(sc, "Enter the number for multiplication table: ");

            for (int i = multiplierStart; i <= multiplierEnd; i++) {
                int index = i - multiplierStart;
                table[index] = number * i;
            }

            for (int i = multiplierStart; i <= multiplierEnd; i++) {
                int index = i - multiplierStart;
                System.out.println(number + " * " + i + " = " + table[index]);
            }
        } finally {
            sc.close();
        }
    }

    private static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (!sc.hasNextInt()) {
                String badInput = sc.next();
                System.out.println("Invalid input: " + badInput);
                continue;
            }
            return sc.nextInt();
        }
    }
}

