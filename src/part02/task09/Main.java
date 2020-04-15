package part02.task09;

import static interaction.Interaction.*;

public class Main {
    public static void main(String[] args) {
        int maxColumnSumIndex;
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
        maxColumnSumIndex = findMax(columnsSums);
        System.out.printf("The largest sum is in the %d column", maxColumnSumIndex + 1);
    }

    private static int[] calcColumnsSums(int[][] matrix) {
        int width = matrix[0].length;
        int[] columnsSums = new int[width];

        for (int i = 0; i < width; i++) {
            for (int[] arr : matrix) {
                columnsSums[i] += arr[i];
            }
        }
        return columnsSums;
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