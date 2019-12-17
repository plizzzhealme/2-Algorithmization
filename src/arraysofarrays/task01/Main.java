package arraysofarrays.task01;

import static cleaner.Cleaner.*;

public class Main {
    public static void main(String[] args) {
        print("Enter number of rows");

        int rowsNumber = getIntFromUser();

        print("Enter number of columns");

        int columnsNumber = getIntFromUser();
        int[][] matrix = generateIntegersMatrix(rowsNumber, columnsNumber);

        print("Initial matrix");
        print(matrix);
        print("Odd columns with first element bigger than the last one:");

        for (int i = 0; i < columnsNumber; i += 2) {
            if (matrix[0][i] > matrix[rowsNumber - 1][i]) {
                for (int j = 0; j < rowsNumber; j++) {
                    System.out.printf("%4d", matrix[j][i]);
                }

                System.out.println();
            }
        }
    }
}
