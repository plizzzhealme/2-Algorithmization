package part02.task05;

import static interaction.Interaction.getPositiveInt;
import static interaction.Interaction.print;

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

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size - row; col++) {
                matrix[row][col] = row + 1;
            }
        }
        return matrix;
    }
}