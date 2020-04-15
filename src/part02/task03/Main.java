package part02.task03;

import static interaction.Interaction.*;

public class Main {
    public static void main(String[] args) {
        int k;
        int p;
        int height;
        int width;
        int[][] matrix;

        System.out.println("Enter matrix height and width");
        height = getPositiveInt();
        width = getPositiveInt();
        matrix = buildIntsMatrix(height, width);
        System.out.println("Initial matrix:");
        print(matrix);
        System.out.println("Enter row number");
        k = getPositiveInt();

        if (k <= height) {
            System.out.printf("Row №%d:%n", k);
            print(matrix[k - 1]);
        } else {
            System.out.println("Out of bound");
        }
        System.out.println("Enter column number");
        p = getPositiveInt();

        if (p <= width) {
            System.out.printf("Column №%d:%n", p);
            part02.task01.Main.printColumn(matrix, p - 1);
        } else {
            System.out.println("Out of bound");
        }
    }

    private static void printColumn(int[][] matrix, int col) {
        if (0 <= col && col < matrix[0].length) {
            for (int[] arr : matrix) {
                System.out.printf("%3d ", arr[col]);
            }
        }
    }

    private static void printRow(int[][] matrix, int row) {
        if (0 <= row && row < matrix.length) {
            print(matrix[row]);
        }
    }
}