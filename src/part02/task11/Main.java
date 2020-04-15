package part02.task11;

import static interaction.Interaction.getRandomInt;
import static interaction.Interaction.print;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int minFrequency = 3;
        int height = 10;
        int width = 20;
        int[][] matrix = buildMatrix(height, width);

        System.out.println("Initial matrix:");
        print(matrix);
        System.out.printf("Rows with number %d occurring %d and more times:%n", n, minFrequency);
        printRowsNumbers(matrix, n, minFrequency);
    }

    private static void printRowsNumbers(int[][] matrix, int n, int minFrequency) {
        int height = matrix.length;

        for (int i = 0; i < height; i++) {
            int count = 0;

            for (int value : matrix[i]) {
                if (value == n) {
                    count++;
                }
            }

            if (count >= minFrequency) {
                System.out.println(i + 1);
            }
        }
    }

    private static int[][] buildMatrix(int height, int width) {
        int bound = 16;
        int[][] matrix = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = getRandomInt(bound);
            }
        }
        return matrix;
    }
}