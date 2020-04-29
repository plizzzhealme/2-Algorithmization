package io.github.plizzzhealme.part02.task03;

import static io.github.plizzzhealme.interaction.Interaction.*;

/*
Дана матрица. Вывести k-ю строку и p-й столбец
 */
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
            System.out.printf("Row %d:%n", k);
            print(matrix[k - 1]);
        } else {
            System.out.println("Row index is out of bounds");
        }

        System.out.println("Enter column number");
        p = getPositiveInt();

        if (p <= width) {
            System.out.printf("Column %d:%n", p);
            printColumn(matrix, p - 1);
        } else {
            System.out.println("Column index is out of bounds");
        }
    }

    private static void printColumn(int[][] matrix, int col) {
        for (int[] arr : matrix) {
            System.out.printf("%4d", arr[col]);
        }
    }
}