package arraysofarrays.task11;

import java.util.Random;

import static cleaner.Cleaner.print;

public class Main {
    private static final int ROWS_NUMBER = 10;
    private static final int COLUMNS_NUMBER = 20;
    private static final int BOUND = 16;
    private static final int CHECKING_NUMBER = 5;
    private static final int MIN_NUMBER_OF_ENTRIES = 3;

    public static void main(String[] args) {
        int[][] matrix = new int[ROWS_NUMBER][COLUMNS_NUMBER];
        Random random = new Random();

        for (int i = 0; i < ROWS_NUMBER; i++) {
            for (int j = 0; j < COLUMNS_NUMBER; j++) {
                matrix[i][j] = random.nextInt(BOUND);
            }
        }

        print("Initial matrix:");
        print(matrix);
        print("Rows with number 5 occurring 3 and more times:");

        for (int i = 0; i < ROWS_NUMBER; i++) {
            int fiveCount = 0;

            for (int j = 0; j < COLUMNS_NUMBER; j++) {
                if (matrix[i][j] == CHECKING_NUMBER) {
                    fiveCount++;
                }
            }

            if (fiveCount >= MIN_NUMBER_OF_ENTRIES) {
                System.out.printf("%4d", i + 1);
            }
        }
    }
}