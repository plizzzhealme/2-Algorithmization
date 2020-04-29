package io.github.plizzzhealme.part02.task04;

import static io.github.plizzzhealme.interaction.Interaction.getEvenInt;
import static io.github.plizzzhealme.interaction.Interaction.print;

/*
Сформировать квадратную матрицу порядка n по образцу, n - четное
1 2 3 4 5 6
6 5 4 3 2 1
1 2 3 4 5 6
6 5 4 3 2 1
1 2 3 4 5 6
6 5 4 3 2 1
 */
public class Main {
    public static void main(String[] args) {
        int size;
        int[][] matrix;

        System.out.println("Enter matrix size");
        size = getEvenInt();

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