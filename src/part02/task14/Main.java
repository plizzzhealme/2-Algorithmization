package part02.task14;

import static interaction.Interaction.*;

public class Main {
    public static void main(String[] args) {
        int height;
        int width;
        int[][] matrix;

        System.out.println("Enter matrix height and width");
        height = getPositiveInt();
        width = getPositiveInt();

        if (height < width) {
            System.out.println("Height can't be less then width");
        } else {
            matrix = buildMatrix(height, width);
            print(matrix);
        }
    }

    private static int[][] buildMatrix(int height, int width) {
        int[][] matrix = new int[height][width];

        for (int col = 0; col < width; col++) {
            fillColumn(matrix, col);
        }
        return matrix;
    }

    private static void fillColumn(int[][] matrix, int col) {
        int height = matrix.length;
        int count = 0;
        int maxOneCount = col + 1;
        int maxZeroCount = height - col - 1;
        int halfWidth = matrix[0].length / 2;

        if (col < halfWidth) {
            while (count < maxOneCount) {
                int index = getRandomInt(height);

                if (matrix[index][col] != 1) {
                    matrix[index][col] = 1;
                    count++;
                }
            }
        } else {
            for (int[] arr : matrix) {
                arr[col] = 1;
            }

            while (count < maxZeroCount) {
                int index = getRandomInt(height);

                if (matrix[index][col] != 0) {
                    matrix[index][col] = 0;
                    count++;
                }
            }
        }
    }
}