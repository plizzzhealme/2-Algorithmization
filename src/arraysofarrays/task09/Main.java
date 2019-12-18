package arraysofarrays.task09;

import java.util.Random;

import static cleaner.Cleaner.getIntFromUser;
import static cleaner.Cleaner.print;

public class Main {
    private static final int BOUND = 13;

    public static void main(String[] args) {
        print("Enter the number of rows");

        int rowsNumber = getIntFromUser();

        print("Enter the number of columns");

        int columnsNumber = getIntFromUser();

        int[][] matrix = new int[rowsNumber][columnsNumber];
        Random random = new Random();

        for (int i = 0; i < rowsNumber; i++) {
            for (int j = 0; j < columnsNumber; j++) {
                matrix[i][j] = random.nextInt(BOUND);
            }
        }

        print("Initial matrix:");
        print(matrix);

        int[] sums = new int[columnsNumber];

        for (int i = 0; i < columnsNumber; i++) {
            for (int j = 0; j < rowsNumber; j++) {
                sums[i] += matrix[j][i];
            }
        }

        print("Columns sums:");
        print(sums);

        int maxColumnIndex = 0;

        for (int i = 1; i < columnsNumber; i++) {
            if (sums[i] > sums[maxColumnIndex]) {
                maxColumnIndex = i;
            }
        }

        print("The largest sum in the " + (maxColumnIndex + 1) + " column");
    }
}
