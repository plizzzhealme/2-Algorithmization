package part02.task16;

import static interaction.Interaction.getPositiveInt;
import static interaction.Interaction.print;

public class Main {
    public static void main(String[] args) {
        int size;
        int[][] magicSquare;
        int option;

        System.out.println("Enter magic square size");
        size = getPositiveInt();

        if (size == 2) {
            System.out.println("There is no such magic square");
            return;
        }
        option = size % 4;

        switch (option) {
            case 0:
                magicSquare = buildDoubleEvenMagicSquare(size);
                break;
            case 2:
                magicSquare = buildEvenMagicSquare(size);
                break;
            default:
                magicSquare = buildOddMagicSquare(size);
                break;
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

        for (int i = 0; i < halfSize; i++) {
            for (int j = 0; j < halfSize; j++) {
                magicSquare[i][j] = miniMagic[i][j];
                magicSquare[i + halfSize][j + halfSize] = miniMagic[i][j] + halfSize * halfSize;
                magicSquare[i][j + halfSize] = miniMagic[i][j] + 2 * halfSize * halfSize;
                magicSquare[i + halfSize][j] = miniMagic[i][j] + 3 * halfSize * halfSize;
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

    private static void swap(int[][] matrix, int i1, int j1, int i2, int j2) {
        int temp = matrix[i1][j1];
        matrix[i1][j1] = matrix[i2][j2];
        matrix[i2][j2] = temp;
    }

    private static int[][] buildOddMagicSquare(int size) {
        int[][] magicSquare = new int[size][size];
        int max = size * size;
        int i = 0;
        int j = size / 2;

        for (int n = 1; n <= max; n++) {
            magicSquare[i][j] = n;

            if (j == size - 1 && i == 0) {
                i++;
            } else if (i == 0) {
                i = size - 1;
                j++;
            } else if (j == size - 1) {
                i--;
                j = 0;
            } else if (magicSquare[i - 1][j + 1] != 0) {
                i++;
            } else {
                i--;
                j++;
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

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i < quarterSize && quarterSize <= j && j < size - quarterSize) {
                    magicSquare[i][j] = min;
                } else if (i >= size - quarterSize && quarterSize <= j && j < size - quarterSize) {
                    magicSquare[i][j] = min;
                } else if (quarterSize <= i && i < size - quarterSize && j < quarterSize) {
                    magicSquare[i][j] = min;
                } else if (quarterSize <= i && i < size - quarterSize && j >= size - quarterSize) {
                    magicSquare[i][j] = min;
                } else {
                    magicSquare[i][j] = max;
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