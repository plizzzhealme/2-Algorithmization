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

        for (int i = 0; i < width; i++) {
            sortColumn(matrix, i);
        }
    }

    private static void reverseColumns(int[][] matrix) {
        int width = matrix[0].length;

        for (int i = 0; i < width; i++) {
            reverseColumn(matrix, i);
        }
    }

    private static void reverseColumn(int[][] matrix, int column) {
        int height = matrix.length;
        int halfHeight = height / 2;

        for (int i = 0; i < halfHeight; i++) {
            swap(matrix, column, i, height - 1 - i);
        }
    }

    private static void sortColumn(int[][] matrix, int index) {
        int length = matrix.length;
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < length - 1; i++) {
                if (matrix[i][index] > matrix[i + 1][index]) {
                    swap(matrix, index, i, i + 1);
                    isSorted = false;
                }
            }
        }
    }

    private static void swap(int[][] matrix, int col, int row1, int row2) {
        int height = matrix.length;
        int width = matrix[0].length;

        if (0 <= col && col < width
            && 0 <= row1 && row1 < height
            && 0 <= row2 && row2 < height) {
            int temp = matrix[row1][col];
            matrix[row1][col] = matrix[row2][col];
            matrix[row2][col] = temp;
        }
    }
}