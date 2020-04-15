package part02.task14;

import java.util.Random;

import static interaction.Interaction.getPositiveInt;
import static interaction.Interaction.print;

public class Main {
    private static final Random r = new Random();

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

        for (int i = 0; i < width; i++) {
            fillColumn(matrix, i);
        }
        return matrix;
    }

    private static void fillColumn(int[][] matrix, int column) {
        int height = matrix.length;
        int count = 0;
        int maxOneCount = column + 1;
        int maxZeroCount = height - column - 1;
        int halfWidth = matrix[0].length / 2;

        if (column < halfWidth) {
            while (count < maxOneCount) {
                int index = r.nextInt(height);

                if (matrix[index][column] != 1) {
                    matrix[index][column] = 1;
                    count++;
                }
            }
        } else {
            for (int[] arr : matrix) {
                arr[column] = 1;
            }

            while (count < maxZeroCount) {
                int index = r.nextInt(height);

                if (matrix[index][column] != 0) {
                    matrix[index][column] = 0;
                    count++;
                }
            }
        }
    }
}