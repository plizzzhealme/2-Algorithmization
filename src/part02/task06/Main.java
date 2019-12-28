package part02.task06;

import static cleaner.Cleaner.getIntFromUser;
import static cleaner.Cleaner.print;

public class Main {
    public static void main(String[] args) {
        print("Enter matrix half size");

        int halfSize = getIntFromUser();
        int size = halfSize * 2;
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

        print(matrix);
    }
}
