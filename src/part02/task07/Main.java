package part02.task07;

import static interaction.Interaction.getPositiveInt;
import static interaction.Interaction.print;

public class Main {
    public static void main(String[] args) {
        int halfSize;
        int size;
        int positiveCount;
        double[][] matrix;

        System.out.println("Enter matrix half size");
        halfSize = getPositiveInt();
        size = halfSize * 2;
        matrix = buildMatrix(size);
        positiveCount = countPositiveElements(matrix);
        print(matrix);
        System.out.printf("The matrix contains %d positive elements", positiveCount);
    }

    private static double[][] buildMatrix(int size) {
        double[][] matrix = new double[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = Math.sin(((i + 1.) * (i + 1) - (j + 1) * (j + 1)) / size);
            }
        }
        return matrix;
    }

    private static int countPositiveElements(double[][] matrix) {
        int positiveCount = 0;

        for (double[] arr : matrix) {
            for (double value : arr) {
                if (value > 0) {
                    positiveCount++;
                }
            }
        }
        return positiveCount;
    }
}