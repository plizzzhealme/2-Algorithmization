package io.github.plizzzhealme.part02.task09;

import static io.github.plizzzhealme.interaction.Interaction.*;

/*
Дана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
Определить, какой столбец содержит максимальную сумму
 */
public class Main {
    public static void main(String[] args) {
        int maxColumn;
        int height;
        int width;
        int[][] matrix;
        int[] sums;

        System.out.println("Enter matrix height and width");
        height = getPositiveInt();
        width = getPositiveInt();

        matrix = buildNotNegativeIntsMatrix(height, width);

        System.out.println("Initial matrix:");
        print(matrix);

        sums = calcColumnsSums(matrix);

        System.out.println("Columns sums:");
        print(sums);

        maxColumn = findMax(sums);

        System.out.printf("The max sum is in the column %d", maxColumn + 1);
    }

    private static int[] calcColumnsSums(int[][] matrix) {
        int width = matrix[0].length;
        int[] sums = new int[width];

        for (int[] arr : matrix) {
            for (int col = 0; col < width; col++) {
                sums[col] += arr[col];
            }
        }
        return sums;
    }

    private static int findMax(int[] arr) {
        int length = arr.length;
        int maxIndex = 0;

        for (int i = 0; i < length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}