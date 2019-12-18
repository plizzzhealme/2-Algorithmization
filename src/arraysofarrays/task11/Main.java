package arraysofarrays.task11;

import java.util.Random;

import static cleaner.Cleaner.print;

public class Main {
    private static final int HEIGHT = 10;
    private static final int WIDTH = 20;
    private static final int BOUND = 16;
    private static final int CHECKING_NUMBER = 5;
    private static final int MIN_NUMBER_OF_ENTRIES = 3;

    public static void main(String[] args) {
        int[][] matrix = new int[HEIGHT][WIDTH];
        Random random = new Random();

        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                matrix[i][j] = random.nextInt(BOUND);
            }
        }

        print("Initial matrix:");
        print(matrix);
        print("Rows with number 5 occurring 3 and more times:");

        for (int i = 0; i < HEIGHT; i++) {
            int checkingNumberCount = 0;

            for (int j = 0; j < WIDTH; j++) {
                if (matrix[i][j] == CHECKING_NUMBER) {
                    checkingNumberCount++;
                }
            }

            if (checkingNumberCount >= MIN_NUMBER_OF_ENTRIES) {
                System.out.printf("%4d", i + 1);
            }
        }
    }
}