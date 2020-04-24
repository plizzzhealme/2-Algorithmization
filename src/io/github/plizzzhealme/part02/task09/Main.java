package io.github.plizzzhealme.part02.task09;

import static io.github.plizzzhealme.interaction.Interaction.*;

public class Main {
    public static void main(String[] args) {
        int maxColumn;
        int height;
        int width;
        int[][] matrix;
        int[] columnsSums;

        System.out.println("Enter matrix height and width");
        height = getPositiveInt();
        width = getPositiveInt();
        matrix = buildNotNegativeIntsMatrix(height, width);
        System.out.println("Initial matrix:");
        print(matrix);
        columnsSums = calcColumnsSums(matrix);
        System.out.println("Columns sums:");
        print(columnsSums);
        maxColumn = findMax(columnsSums);
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