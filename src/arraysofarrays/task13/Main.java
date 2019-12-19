package arraysofarrays.task13;

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

        /*
        Bubble sort algorithm
         */
        for (int j = 0; j < width; j++) {
            boolean isSorted = false;

            while (!isSorted) {
                isSorted = true;

                for (int i = 0; i < height - 1; i++) {
                    if (matrix[i][j] > matrix[i + 1][j]) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = temp;
                        isSorted = false;
                    }
                }
            }
        }

        print("Matrix with columns sorted in ascending order:");
        print(matrix);

        int halfHeight = height / 2;

        /*
        Just swap elements to sort in reverse order
         */
        for (int j = 0; j < width; j++) {
            for (int i = 0; i < halfHeight; i++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[height - 1 - i][j];
                matrix[height - 1 - i][j] = temp;
            }
        }

        print("Matrix with columns sorted in descending order:");
        print(matrix);
    }
}
