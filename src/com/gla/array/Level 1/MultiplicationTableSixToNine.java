package com.gla.array;

public class MultiplicationTableSixToNine {
    public static void main(String[] args) {
        int startNumber = 6;
        int endNumber = 9;
        int multiplierStart = 1;
        int multiplierEnd = 10;
        int baseCount = endNumber - startNumber + 1;
        int totalResults = baseCount * (multiplierEnd - multiplierStart + 1);
        int[] results = new int[totalResults];

        int index = 0;
        for (int base = startNumber; base <= endNumber; base++) {
            for (int multiplier = multiplierStart; multiplier <= multiplierEnd; multiplier++) {
                results[index] = base * multiplier;
                index++;
            }
        }

        index = 0;
        for (int base = startNumber; base <= endNumber; base++) {
            for (int multiplier = multiplierStart; multiplier <= multiplierEnd; multiplier++) {
                System.out.println(base + " * " + multiplier + " = " + results[index]);
                index++;
            }
        }
    }
}

