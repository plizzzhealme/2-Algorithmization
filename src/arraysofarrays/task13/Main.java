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
        for (int i = 0; i < width; i++) {
            boolean isSorted = false;

            while (!isSorted) {
                isSorted = true;

                for (int j = 0; j < height - 1; j++) {
                    if (matrix[j][i] > matrix[j + 1][i]) {
                        int temp = matrix[j][i];
                        matrix[j][i] = matrix[j + 1][i];
                        matrix[j + 1][i] = temp;
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
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < halfHeight; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[height - 1 - j][i];
                matrix[height - 1 - j][i] = temp;
            }
        }

        print("Matrix with columns sorted in descending order:");
        print(matrix);
    }
}
