package com.gla.methods.level3;

import java.util.Scanner;

public class MatrixOperations {
    public static int[][] addMatrices(int[][] first, int[][] second) {
        int rows = first.length;
        int columns = first[0].length;
        int[][] result = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                result[row][column] = first[row][column] + second[row][column];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] first, int[][] second) {
        int rows = first.length;
        int columns = first[0].length;
        int[][] result = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                result[row][column] = first[row][column] - second[row][column];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] first, int[][] second) {
        int rows = first.length;
        int columns = second[0].length;
        int common = second.length;
        int[][] result = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                for (int k = 0; k < common; k++) {
                    result[row][column] += first[row][k] * second[k][column];
                }
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static int[][] readMatrix(Scanner scanner, int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                matrix[row][column] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rows and columns for first matrix: ");
        int rowsFirst = scanner.nextInt();
        int columnsFirst = scanner.nextInt();
        System.out.println("Enter first matrix values:");
        int[][] first = readMatrix(scanner, rowsFirst, columnsFirst);

        System.out.print("Enter rows and columns for second matrix: ");
        int rowsSecond = scanner.nextInt();
        int columnsSecond = scanner.nextInt();
        System.out.println("Enter second matrix values:");
        int[][] second = readMatrix(scanner, rowsSecond, columnsSecond);

        if (rowsFirst == rowsSecond && columnsFirst == columnsSecond) {
            System.out.println("Added matrix:");
            printMatrix(addMatrices(first, second));

            System.out.println("Subtracted matrix:");
            printMatrix(subtractMatrices(first, second));
        } else {
            System.out.println("Addition/Subtraction not possible due to size mismatch.");
        }

        if (columnsFirst == rowsSecond) {
            System.out.println("Multiplied matrix:");
            printMatrix(multiplyMatrices(first, second));
        } else {
            System.out.println("Multiplication not possible due to dimension mismatch.");
        }
        scanner.close();
    }
}
