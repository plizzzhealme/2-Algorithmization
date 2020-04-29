package io.github.plizzzhealme.part02.task12;

import static io.github.plizzzhealme.interaction.Interaction.*;

/*
Отсортировать строки матрицы по возрастанию и убыванию
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

        sortRows(matrix);

        System.out.println("Ascending order:");
        print(matrix);

        reverseRows(matrix);

        System.out.println("Descending order:");
        print(matrix);
    }

    private static void sortRows(int[][] matrix) {
        for (int[] arr : matrix) {
            sort(arr);
        }
    }

    private static void reverseRows(int[][] matrix) {
        int width = matrix[0].length;
        int halfWidth = width / 2;

        for (int[] arr : matrix) {
            for (int i = 0; i < halfWidth; i++) {
                swap(arr, i, width - 1 - i);
            }
        }
    }

    private static void sort(int[] arr) {
        int length = arr.length;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;

            for (int i = 0; i < length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    sorted = false;
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}