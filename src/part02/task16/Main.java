package part02.task16;


import static cleaner.Cleaner.getIntFromUser;
import static cleaner.Cleaner.print;

public class Main {
    public static void main(String[] args) {
        print("Enter matrix size");

        int size = getIntFromUser();
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = i * size + j + 1;
            }
        }
        print(matrix);

        int i = 0;
        while (replace(matrix, size)) {
            //  print(matrix);
            // print("==========");
            if (isMagic(matrix)) {
                i++;
                print(matrix);
                print("=====");
            }
        }
        print("111");
        //printMagicSquare(matrix, size, maxNumber, magicSum);

        /*if (size % 2 == 1) { //For 2n+1 matrix (odd)
            matrix = generateOddMagicSquare(size);
        } else if (size % 4 == 0) { //For 4n matrix (double even)
            matrix = generateDoubleEvenMagicSquare(size);
        } else { //For 4n+1 matrix (even)

            matrix = new int[1][1];
        }

        if (isMagic(matrix)) {
            print(matrix);
        }*/
    }

    private static boolean replace(int[][] matrix, int size) {
        int j = size * size - 2;


        while (j != -1 && matrix[getRow(j, size)][getCol(j, size)]
                >= matrix[getRow(j + 1, size)][getCol(j + 1, size)]) {
            j--;
        }

        if (j == -1) {
            return false;
        }

        int k = size * size - 1;

        while (matrix[getRow(j, size)][getCol(j, size)]
                >= matrix[getRow(k, size)][getCol(k, size)]) {
            k--;
        }

        swapElements(matrix, getRow(j, size), getCol(j, size), getRow(k, size), getCol(k, size));

        int l = j + 1;
        int r = size * size - 1;

        while (l < r) {
            swapElements(matrix, getRow(l, size), getCol(l, size), getRow(r, size), getCol(r, size));
            l++;
            r--;
        }

        return true;
    }

    private static int getRow(int index, int size) {
        return index / size;
    }

    private static int getCol(int index, int size) {
        return index % size;
    }

    private static void swapElements(int[][] matrix, int i1, int j1, int i2, int j2) {
        int temp = matrix[i1][j1];
        matrix[i1][j1] = matrix[i2][j2];
        matrix[i2][j2] = temp;
    }

    private static boolean isMagic(final int[][] matrix) {
        int size = matrix.length;
        int magicSum = size * (size * size + 1) / 2;
        int mainDiagonalSum = 0;
        int antidiagonalSum = 0;

        for (int i = 0; i < size; i++) {
            int rowSum = 0;
            int columnSum = 0;
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

// --Commented out by Inspection START (21.12.2019 04:49):
//    private static int[][] generateOddMagicSquare(int size) {
//        int[][] matrix = new int[size][size];
//        int maxNumber = size * size;
//        int i = 0;
//        int j = size / 2;
//
//        for (int n = 1; n <= maxNumber; n++) {
//            matrix[i][j] = n;
//            if (j == size - 1 && i == 0) {
//                i++;
//            } else if (i == 0) {
//                i = size - 1;
//                j++;
//            } else if (j == size - 1) {
//                i--;
//                j = 0;
//            } else if (matrix[i - 1][j + 1] != 0) {
//                i++;
//            } else {
//                i--;
//                j++;
//            }
//        }
//
//        return matrix;
//    }
// --Commented out by Inspection STOP (21.12.2019 04:49)

// --Commented out by Inspection START (21.12.2019 04:48):
//    private static int[][] generateDoubleEvenMagicSquare(int size) {
//        int[][] matrix = new int[size][size];
//
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                matrix[i][j] = i * size + j + 1;
//            }
//        }
//
//        int halfSize = size / 2;
//
//        for (int i = 0; i < halfSize; i++) {
//            int j = i % 4 == 3 || i % 4 == 0 ? 0 : 1;
//
//            while (j < size) {
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[size - 1 - i][size - 1 - j];
//                matrix[size - 1 - i][size - 1 - j] = temp;
//                j += j % 2 == 0 ? 3 : 1;
//            }
//        }
//
//        return matrix;
//    }
// --Commented out by Inspection STOP (21.12.2019 04:48)
}

