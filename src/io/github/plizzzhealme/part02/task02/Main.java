package io.github.plizzzhealme.part02.task02;

import static io.github.plizzzhealme.interaction.Interaction.*;

public class Main {
    public static void main(String[] args) {
        int size;
        int[][] matrix;

        System.out.println("Enter matrix size");
        size = getPositiveInt();
        matrix = buildSquareMatrix(size);
        System.out.println("Initial matrix:");
        print(matrix);
        System.out.println("Main diagonal:");
        printDiagonal(matrix);
        System.out.println("Antidiagonal:");
        printAntidiagonal(matrix);
    }

    private static void printDiagonal(int[][] matrix) {
        int size = matrix.length;

        for (int i = 0; i < size; i++) {
            System.out.printf("%4d", matrix[i][i]);
        }
        System.out.println();
    }

    private static void printAntidiagonal(int[][] matrix) {
        int size = matrix.length;

        for (int i = 0; i < size; i++) {
            System.out.printf("%4d", matrix[i][size - 1 - i]);
        }
        System.out.println();
    }
}