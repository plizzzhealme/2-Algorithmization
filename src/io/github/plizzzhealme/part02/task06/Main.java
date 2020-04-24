package io.github.plizzzhealme.part02.task06;

import static io.github.plizzzhealme.interaction.Interaction.getPositiveInt;
import static io.github.plizzzhealme.interaction.Interaction.print;

public class Main {
    public static void main(String[] args) {
        int halfSize;
        int size;
        int[][] matrix;

        System.out.println("Enter matrix half size");
        halfSize = getPositiveInt();
        size = halfSize * 2;
        matrix = buildMatrix(size);
        print(matrix);
    }

    private static int[][] buildMatrix(int size) {
        int halfSize = size / 2;
        int[][] matrix = new int[size][size];

        for (int row = 0; row < halfSize; row++) {
            for (int col = row; col < size - row; col++) {
                matrix[row][col] = 1;
            }
        }

        for (int row = halfSize; row < size; row++) {
            for (int col = size - row - 1; col < row + 1; col++) {
                matrix[row][col] = 1;
            }
        }
        return matrix;
    }
}