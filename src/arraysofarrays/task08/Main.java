package arraysofarrays.task08;

import static cleaner.Cleaner.*;

public class Main {
    public static void main(String[] args) {
        print("Enter the number of rows");

        int rowsNumber = getIntFromUser();

        print("Enter the number of columns");

        int columnsNumber = getIntFromUser();
        int[][] matrix = generateMatrix(rowsNumber, columnsNumber);

        print("Initial matrix");
        print(matrix);
        print("Enter column number from 1 to " + columnsNumber);

        int m = getIntFromUser();

        print("Enter another column number from 1 to " + columnsNumber);

        int n = getIntFromUser();

        for (int i = 0; i < rowsNumber; i++) {
            int temp = matrix[i][m - 1];
            matrix[i][m - 1] = matrix[i][n - 1];
            matrix[i][n - 1] = temp;
        }

        print("Final matrix:");
        print(matrix);
    }
}
