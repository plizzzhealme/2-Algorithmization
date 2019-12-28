package part02.task03;

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
        print("Enter row number");

        int k = getIntFromUser();

        print("Row #" + k + ":");
        print(matrix[k - 1]);

        print("Enter column number");

        int p = getIntFromUser();

        print("Column #" + p + ":");

        for (int i = 0; i < height; i++) {
            System.out.printf("%4d", matrix[i][p - 1]);
        }
    }
}
