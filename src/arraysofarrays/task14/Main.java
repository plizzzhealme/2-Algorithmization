package arraysofarrays.task14;

import java.util.Random;

import static cleaner.Cleaner.getIntFromUser;
import static cleaner.Cleaner.print;

public class Main {
    public static void main(String[] args) {
        print("Enter matrix height");

        int height = getIntFromUser();

        print("Enter matrix width");

        int width = getIntFromUser();

        /*
        To meet the requirements of the task
        the height can't be less then the width
         */
        if (height < width) {
            height = width;
        }

        int[][] matrix = new int[height][width];
        Random random = new Random();
        int bound = height;
        int halfWidth = width / 2;

        /*
        The left columns contain more '0' than '1',
        we immediately fill them with '1' at random
         */
        for (int j = 0; j < halfWidth; j++) {
            int count = 0;
            while (count <= j) {
                int index = random.nextInt(bound);
                if (matrix[index][j] == 0) {
                    matrix[index][j] = 1;
                    count++;
                }
            }
        }

        /*
        The right columns contain more '1' than '0',
        We completely fill them with '1' for the beginning
         */
        for (int i = 0; i < height; i++) {
            for (int j = halfWidth; j < width; j++) {
                matrix[i][j] = 1;
            }
        }

        /*
        And then fill with '0' at random
         */
        for (int j = halfWidth; j < width; j++) {
            int count = 0;
            while (count < height - j - 1) {
                int index = random.nextInt(bound);
                if (matrix[index][j] == 1) {
                    matrix[index][j] = 0;
                    count++;
                }
            }
        }

        print(matrix);
    }
}