package part02.task08;

import static interaction.Interaction.*;

public class Main {
    public static void main(String[] args) {
        int m;
        int n;
        int height;
        int width;
        int[][] matrix;

        System.out.println("Enter matrix height and width");
        height = getPositiveInt();
        width = getPositiveInt();
        matrix = buildIntsMatrix(height, width);
        System.out.println("Initial matrix:");
        print(matrix);
        System.out.println("Enter columns to swap");
        m = getPositiveInt();
        n = getPositiveInt();

        if (m <= width && n <= width) {
            swapColumns(matrix, m - 1, n - 1);
        } else {
            System.out.println("Out of bound");
        }
        System.out.println("Final matrix:");
        print(matrix);
    }

    private static void swapColumns(int[][] matrix, int m, int n) {
        int height = matrix.length;
        int width = matrix[0].length;

        if (m < width && n < width) {
            for (int i = 0; i < height; i++) {
                int temp = matrix[i][m];
                matrix[i][m] = matrix[i][n];
                matrix[i][n] = temp;
            }
        }
    }
}