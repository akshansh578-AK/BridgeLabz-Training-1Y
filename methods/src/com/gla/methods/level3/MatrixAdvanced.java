package com.gla.methods.level3;

import java.util.Scanner;

public class MatrixAdvanced {
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        double[][] transposed = new double[columns][rows];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                transposed[column][row] = matrix[row][column];
            }
        }
        return transposed;
    }

    public static double determinant2x2(double[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static double[][] inverse2x2(double[][] matrix) {
        double determinant = determinant2x2(matrix);
        if (determinant == 0) {
            return null;
        }
        return new double[][]{
            {matrix[1][1] / determinant, -matrix[0][1] / determinant},
            {-matrix[1][0] / determinant, matrix[0][0] / determinant}
        };
    }

    public static void printMatrix(double[][] matrix) {
        if (matrix == null) {
            System.out.println("Matrix has no inverse.");
            return;
        }
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%.3f ", value);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matrix = new double[2][2];

        System.out.println("Enter 2x2 matrix values:");
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 2; column++) {
                matrix[row][column] = scanner.nextDouble();
            }
        }

        System.out.println("Transpose:");
        printMatrix(transpose(matrix));

        double determinant = determinant2x2(matrix);
        System.out.println("Determinant: " + determinant);

        System.out.println("Inverse:");
        printMatrix(inverse2x2(matrix));
        scanner.close();
    }
}
