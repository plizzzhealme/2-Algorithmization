package part02.task07;

import static cleaner.Cleaner.getIntFromUser;
import static cleaner.Cleaner.print;

public class Main {
    public static void main(String[] args) {
        print("Enter matrix half size");

        int halfSize = getIntFromUser();
        int size = halfSize * 2;
        double[][] matrix = new double[size][size];
        int positiveElementsCount = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = Math.sin(((i + 1.) * (i + 1) - (j + 1) * (j + 1)) / size);
                if (matrix[i][j] > 0) {
                    positiveElementsCount++;
                }
            }
        }

        print(matrix);
        print("The matrix contains " + positiveElementsCount + " positive elements");
    }
}
