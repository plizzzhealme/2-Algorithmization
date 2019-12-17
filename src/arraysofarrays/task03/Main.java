package arraysofarrays.task03;

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
        print("Enter row number");

        int k = getIntFromUser();

        print("Row #" + k + ":");
        print(matrix[k - 1]);

        print("Enter column number");

        int p = getIntFromUser();

        print("Column #" + p + ":");
        for (int i = 0; i < rowsNumber; i++) {
            System.out.printf("%4d", matrix[i][p - 1]);
        }
    }
}
