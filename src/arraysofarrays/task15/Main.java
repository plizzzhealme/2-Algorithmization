package arraysofarrays.task15;

import static cleaner.Cleaner.*;

public class Main {
    public static void main(String[] args) {
        print("Enter matrix height");

        int height = getIntFromUser();

        print("Enter matrix width");

        int width = getIntFromUser();
        int[][] matrix = generateMatrix(height, width);

        print("Initial matrix:");
        print(matrix);

        int max = matrix[0][0];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                max = Math.max(matrix[i][j], max);
            }
        }

        print("The maximum element = " + max);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = max;
                }
            }
        }

        print("Final matrix:");
        print(matrix);
    }
}