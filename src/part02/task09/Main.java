package part02.task09;

import java.util.Random;

import static cleaner.Cleaner.getIntFromUser;
import static cleaner.Cleaner.print;

public class Main {
    private static final int BOUND = 13;

    public static void main(String[] args) {
        print("Enter matrix height");

        int height = getIntFromUser();

        print("Enter matrix width");

        int width = getIntFromUser();

        int[][] matrix = new int[height][width];
        Random random = new Random();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = random.nextInt(BOUND);
            }
        }

        print("Initial matrix:");
        print(matrix);

        int[] columnsSums = new int[width];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                columnsSums[i] += matrix[j][i];
            }
        }

        print("Columns sums:");
        print(columnsSums);

        int maxColumnSumIndex = 0;

        for (int i = 1; i < width; i++) {
            if (columnsSums[i] > columnsSums[maxColumnSumIndex]) {
                maxColumnSumIndex = i;
            }
        }

        print("The largest sum is in the " + (maxColumnSumIndex + 1) + " column");
    }
}