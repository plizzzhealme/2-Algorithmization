package part02.task01;

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
        System.out.println("Odd columns with first element bigger than the last one:");
        printColumns(matrix);
    }

    private static void printColumns(int[][] matrix) {
        int width = matrix[0].length;

        for (int col = 0; col < width; col += 2) {
            printColumn(matrix, col);
        }
    }

    public static void printColumn(int[][] matrix, int col) {
        for (int[] arr : matrix) {
            System.out.printf("%4d", arr[col]);
        }
        System.out.println();
    }
}