package part02.task04;

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

        for (int i = 1; i < size; i += 2) {
            for (int j = 0; j < size; j++) {
                matrix[i - 1][j] = j + 1;
                matrix[i][j] = size - j;
            }
        }
        return matrix;
    }
}