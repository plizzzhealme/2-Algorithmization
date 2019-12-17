package arraysofarrays.task02;

import static cleaner.Cleaner.*;

public class Main {
    public static void main(String[] args) {
        print("Enter matrix size");

        int size = getIntFromUser();
        int[][] matrix = generateIntegersMatrix(size, size);

        print("Initial matrix");
        print(matrix);
        print("Main diagonal:");

        for (int i = 0; i < size; i++) {
            System.out.printf("%4d", matrix[i][i]);
        }

        System.out.println();
        print("Antidiagonal:");

        for (int i = 0; i < size; i++) {
            System.out.printf("%4d", matrix[i][size - 1 - i]);
        }
    }
}
