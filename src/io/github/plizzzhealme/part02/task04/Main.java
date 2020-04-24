package io.github.plizzzhealme.part02.task04;

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
        int[][] matrix = new int[size][size];

        for (int row = 1; row < size; row += 2) {
            for (int col = 0; col < size; col++) {
                matrix[row - 1][col] = col + 1;
                matrix[row][col] = size - col;
            }
        }
        return matrix;
    }
}