package arraysofarrays.task12;

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
        for (int i = 0; i < height; i++) {
            boolean isSorted = false;

            while (!isSorted) {
                isSorted = true;

                for (int j = 0; j < width - 1; j++) {
                    if (matrix[i][j] > matrix[i][j + 1]) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = temp;
                        isSorted = false;
                    }
                }
            }
        }

        print("Matrix sorted in ascending order:");
        print(matrix);

        int halfWidth = width / 2;

        /*
        Just swap elements to sort in reverse order
         */
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < halfWidth; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][width - 1 - j];
                matrix[i][width - 1 - j] = temp;
            }
        }

        print("Matrix sorted in descending order:");
        print(matrix);
    }
}
