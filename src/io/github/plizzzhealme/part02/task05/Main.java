package io.github.plizzzhealme.part02.task05;

import static io.github.plizzzhealme.interaction.Interaction.getEvenInt;
import static io.github.plizzzhealme.interaction.Interaction.print;

/*
Сформировать квадратную матрицу порядка n по образцу, n - четное
1 1 1 1 1 1
2 2 2 2 2 0
3 3 3 3 0 0
4 4 4 0 0 0
5 5 0 0 0 0
6 0 0 0 0 0
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

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size - row; col++) {
                matrix[row][col] = row + 1;
            }
        }
        return matrix;
    }
}