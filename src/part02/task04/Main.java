package part02.task04;

import static cleaner.Cleaner.getIntFromUser;
import static cleaner.Cleaner.print;

public class Main {
    public static void main(String[] args) {
        print("Enter matrix half size");

        int halfSize = getIntFromUser();
        int size = halfSize * 2;
        int[][] matrix = new int[size][size];
        int lastOddRow = size - 1;

        for (int i = 0; i < lastOddRow; i += 2) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = j + 1;
                matrix[i + 1][j] = size - j;
            }
        }

        print(matrix);
    }
}