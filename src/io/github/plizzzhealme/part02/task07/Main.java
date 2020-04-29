package io.github.plizzzhealme.part02.task07;

import static io.github.plizzzhealme.interaction.Interaction.getEvenInt;
import static io.github.plizzzhealme.interaction.Interaction.print;

/*
Сформироватьквадратную матрицу порядка n по правилу
и посчитать количество положительных элементов:
A[i,j] = sin((i^2-j^2)/n)
 */
public class Main {
    public static void main(String[] args) {
        int size;
        int positiveCount;
        double[][] matrix;

        System.out.println("Enter matrix size");
        size = getEvenInt();

        matrix = buildMatrix(size);
        positiveCount = countPositiveElements(matrix);

        print(matrix);
        System.out.printf("The matrix contains %d positive elements", positiveCount);
    }

    private static double[][] buildMatrix(int size) {
        double[][] matrix = new double[size][size];

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                matrix[row][col] = calcValue(row + 1, col + 1, size);
            }
        }
        return matrix;
    }

    private static double calcValue(int i, int j, int n) {
        return Math.sin((double) (i * i - j * j) / n);
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