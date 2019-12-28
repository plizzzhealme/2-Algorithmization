package part02.task05;

import static cleaner.Cleaner.getIntFromUser;
import static cleaner.Cleaner.print;

public class Main {
    public static void main(String[] args) {
        print("Enter matrix half size");

        int halfSize = getIntFromUser();
        int size = halfSize * 2;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                matrix[i][j] = i + 1;
            }
        }

        print(matrix);
    }
}
