package arraysofarrays.task01;

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
        print("Odd columns with first element bigger than the last one:");

        for (int i = 0; i < width; i += 2) {
            if (matrix[0][i] > matrix[height - 1][i]) {
                for (int j = 0; j < height; j++) {
                    System.out.printf("%4d", matrix[j][i]);
                }

                System.out.println();
            }
        }
    }
}