package part02.task06;

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
        int halfSize = size / 2;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < halfSize; i++) {
            for (int j = i; j < size - i; j++) {
                matrix[i][j] = 1;
            }
        }

        for (int i = halfSize; i < size; i++) {
            for (int j = size - i - 1; j < i + 1; j++) {
                matrix[i][j] = 1;
            }
        }
        return matrix;
    }
}