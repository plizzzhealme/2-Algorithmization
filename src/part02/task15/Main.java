package part02.task15;

import static interaction.Interaction.*;

public class Main {
    public static void main(String[] args) {
        int max;
        int height;
        int width;
        int[][] matrix;

        System.out.println("Enter matrix height and width");
        height = getPositiveInt();
        width = getPositiveInt();
        matrix = buildIntsMatrix(height, width);
        System.out.println("Initial matrix:");
        print(matrix);
        max = findMax(matrix);
        System.out.printf("Max = %d%n", max);
        replace(matrix, max);
        System.out.println("Final matrix:");
        print(matrix);
    }

    private static void replace(int[][] matrix, int max) {
        for (int[] arr : matrix) {
            int length = arr.length;

            for (int i = 0; i < length; i++) {
                if (arr[i] % 2 != 0) {
                    arr[i] = max;
                }
            }
        }
    }

    private static int findMax(int[][] matrix) {
        int max = matrix[0][0];

        for (int[] arr : matrix) {
            for (int value : arr) {
                max = Math.max(value, max);
            }
        }
        return max;
    }
}