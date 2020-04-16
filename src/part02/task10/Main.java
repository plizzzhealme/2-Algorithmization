package part02.task10;

import static interaction.Interaction.*;

public class Main {
    public static void main(String[] args) {
        int size;
        int[][] matrix;

        System.out.println("Enter matrix size");
        size = getPositiveInt();
        matrix = buildIntsMatrix(size, size);
        System.out.println("Initial matrix:");
        print(matrix);
        System.out.println("Positive elements of main diagonal:");
        printPositiveElements(matrix);
    }

    private static void printPositiveElements(int[][] matrix) {
        int size = matrix.length;

        for (int i = 0; i < size; i++) {
            if (matrix[i][i] > 0) {
                System.out.println(matrix[i][i]);
            }
        }
    }
}