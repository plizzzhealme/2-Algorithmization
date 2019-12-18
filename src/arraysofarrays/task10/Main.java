package arraysofarrays.task10;

import static cleaner.Cleaner.*;

public class Main {
    public static void main(String[] args) {
        print("Enter matrix size");

        int size = getIntFromUser();
        int[][] matrix = generateSquareMatrix(size);

        print("Initial matrix:");
        print(matrix);
        print("Positive elements of main diagonal:");

        for (int i = 0; i < size; i++) {
            if (matrix[i][i] > 0) {
                System.out.printf("%4d", matrix[i][i]);
            }
        }
    }
}