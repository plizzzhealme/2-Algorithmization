package io.github.plizzzhealme.part02.task16;

import static io.github.plizzzhealme.interaction.Interaction.getPositiveInt;
import static io.github.plizzzhealme.interaction.Interaction.print;

public class Main {
    public static void main(String[] args) {
        int size;
        int[][] magicSquare;

        System.out.println("Enter magic square size");
        size = getPositiveInt();

        if (size == 2) {
            System.out.println("There is no such magic square");
            return;
        } else if (size % 4 == 0) {
            magicSquare = buildDoubleEvenMagicSquare(size);
        } else if (size % 4 == 2) {
            magicSquare = buildEvenMagicSquare(size);
        } else {
            magicSquare = buildOddMagicSquare(size);
        }

        if (isMagic(magicSquare)) {
            System.out.println("It's a magic!");
        } else {
            System.out.println("Building is failed!");
        }
        print(magicSquare);
    }

    //http://www.1728.org/magicsq3.htm
    public static int[][] buildEvenMagicSquare(int size) {
        int[][] magicSquare = new int[size][size];
        int halfSize = size / 2;
        int peakIndex = halfSize / 2;
        int[][] miniMagic = buildOddMagicSquare(halfSize);

        for (int row = 0; row < halfSize; row++) {
            for (int col = 0; col < halfSize; col++) {
                magicSquare[row][col] = miniMagic[row][col];
                magicSquare[row + halfSize][col + halfSize] = miniMagic[row][col] + halfSize * halfSize;
                magicSquare[row][col + halfSize] = miniMagic[row][col] + 2 * halfSize * halfSize;
                magicSquare[row + halfSize][col] = miniMagic[row][col] + 3 * halfSize * halfSize;
            }
        }

        for (int col = 0; col < peakIndex; col++) {
            for (int row = 0; row < halfSize; row++) {
                swap(magicSquare, row, col, row + halfSize, col);
            }
        }

        for (int col = size - peakIndex + 1; col < size; col++) {
            for (int row = 0; row < halfSize; row++) {
                swap(magicSquare, row, col, row + halfSize, col);
            }
        }

        swap(magicSquare, peakIndex, 0, peakIndex + halfSize, 0);
        swap(magicSquare, peakIndex + halfSize, peakIndex, peakIndex, peakIndex);
        return magicSquare;
    }

    private static void swap(int[][] matrix, int row1, int col1, int row2, int col2) {
        int temp = matrix[row1][col1];
        matrix[row1][col1] = matrix[row2][col2];
        matrix[row2][col2] = temp;
    }

    private static int[][] buildOddMagicSquare(int size) {
        int[][] magicSquare = new int[size][size];
        int max = size * size;
        int row = 0;
        int col = size / 2;

        for (int n = 1; n <= max; n++) {
            magicSquare[row][col] = n;

            if (col == size - 1 && row == 0) {
                row++;
            } else if (row == 0) {
                row = size - 1;
                col++;
            } else if (col == size - 1) {
                row--;
                col = 0;
            } else if (magicSquare[row - 1][col + 1] != 0) {
                row++;
            } else {
                row--;
                col++;
            }
        }
        return magicSquare;
    }

    //http://www.1728.org/magicsq2.htm
    private static int[][] buildDoubleEvenMagicSquare(int size) {
        int quarterSize = size / 4;
        int[][] magicSquare = new int[size][size];
        int min = 1;
        int max = size * size;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row < quarterSize && quarterSize <= col && col < size - quarterSize) {
                    magicSquare[row][col] = min;
                } else if (row >= size - quarterSize && quarterSize <= col && col < size - quarterSize) {
                    magicSquare[row][col] = min;
                } else if (quarterSize <= row && row < size - quarterSize && col < quarterSize) {
                    magicSquare[row][col] = min;
                } else if (quarterSize <= row && row < size - quarterSize && col >= size - quarterSize) {
                    magicSquare[row][col] = min;
                } else {
                    magicSquare[row][col] = max;
                }
                min++;
                max--;
            }
        }
        return magicSquare;
    }

    private static boolean isMagic(int[][] matrix) {
        int size = matrix.length;
        int magicSum = size * (size * size + 1) / 2;
        int mainDiagonalSum = 0;
        int antidiagonalSum = 0;
        int rowSum;
        int columnSum;

        for (int i = 0; i < size; i++) {
            rowSum = 0;
            columnSum = 0;
            mainDiagonalSum += matrix[i][i];
            antidiagonalSum += matrix[i][size - i - 1];

            for (int j = 0; j < size; j++) {
                rowSum += matrix[i][j];
                columnSum += matrix[j][i];
            }

            if (rowSum != magicSum || columnSum != magicSum) {
                return false;
            }
        }

        if (mainDiagonalSum != magicSum) {
            return false;
        }
        return antidiagonalSum == magicSum;
    }
}