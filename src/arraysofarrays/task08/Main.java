package arraysofarrays.task08;

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
        print("Enter column number to swap");

        int m = getIntFromUser();

        print("Enter another column number to swap");

        int n = getIntFromUser();

        for (int i = 0; i < height; i++) {
            int temp = matrix[i][m - 1];
            matrix[i][m - 1] = matrix[i][n - 1];
            matrix[i][n - 1] = temp;
        }

        print("Final matrix:");
        print(matrix);
    }
}