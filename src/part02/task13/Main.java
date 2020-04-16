package part02.task13;

import static interaction.Interaction.*;

public class Main {
    public static void main(String[] args) {
        int height;
        int width;
        int[][] matrix;

        System.out.println("Enter matrix height and width");
        height = getPositiveInt();
        width = getPositiveInt();
        matrix = buildIntsMatrix(height, width);
        System.out.println("Initial matrix:");
        print(matrix);
        sortColumns(matrix);
        System.out.println("Ascending order:");
        print(matrix);
        reverseColumns(matrix);
        System.out.println("Descending order:");
        print(matrix);
    }

    private static void sortColumns(int[][] matrix) {
        int width = matrix[0].length;

        for (int col = 0; col < width; col++) {
            sortColumn(matrix, col);
        }
    }

    private static void reverseColumns(int[][] matrix) {
        int height = matrix.length;
        int halfHeight = height / 2;

        for (int row = 0; row < halfHeight; row++) {
            int[] temp = matrix[row];
            matrix[row] = matrix[height - row - 1];
            matrix[height - row - 1] = temp;
        }
    }

    private static void sortColumn(int[][] matrix, int col) {
        int height = matrix.length;
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int row = 0; row < height - 1; row++) {
                if (matrix[row][col] > matrix[row + 1][col]) {
                    int temp = matrix[row][col];
                    matrix[row][col] = matrix[row + 1][col];
                    matrix[row + 1][col] = temp;
                    isSorted = false;
                }
            }
        }
    }
}