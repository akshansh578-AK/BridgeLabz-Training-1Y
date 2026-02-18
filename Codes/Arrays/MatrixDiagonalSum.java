import java.util.Scanner;

// Calculates the sum of the primary diagonal of a matrix.
class MatrixDiagonalSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int rows = scanner.nextInt();
		System.out.print("Enter number of columns: ");
		int cols = scanner.nextInt();

		int[][] userMatrix = readMatrix(scanner, rows, cols);
		System.out.println("\nMatrix provided by user:");
		printMatrix(userMatrix);

		int diagonalSum = sumPrimaryDiagonal(userMatrix);
		System.out.println("Primary diagonal sum: " + diagonalSum);

		scanner.close();
	}

	private static int[][] readMatrix(Scanner scanner, int rows, int cols) {
		int[][] matrix = new int[rows][cols];
		System.out.println("\nEnter " + rows * cols + " integers:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		return matrix;
	}

	private static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int cell : row) {
				System.out.print(cell + " ");
			}
			System.out.println();
		}
	}

	private static int sumPrimaryDiagonal(int[][] matrix) {
		int sum = 0;
		int limit = Math.min(matrix.length, matrix[0].length);
		for (int i = 0; i < limit; i++) {
			sum += matrix[i][i];
		}
		return sum;
	}
}
