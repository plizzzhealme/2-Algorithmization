package io.github.plizzzhealme.part02.task01;

import static io.github.plizzzhealme.interaction.Interaction.*;

/*
Вывести нечетные стобцы, у которых первый элемент больше последнего
 */
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

        System.out.println("Odd columns with first element greater than the last one:");
        printMatchingColumns(matrix);
    }

    private static void printMatchingColumns(int[][] matrix) {
        int height = matrix.length;
        int width = matrix[0].length;

        for (int col = 0; col < width; col += 2) {
            if (matrix[0][col] > matrix[height - 1][col]) {
                printColumn(matrix, col);
            }
        }
    }

    public static void printColumn(int[][] matrix, int col) {
        for (int[] arr : matrix) {
            System.out.printf("%4d", arr[col]);
        }
        System.out.println();
    }
}