package part01.task03;

import static cleaner.Cleaner.*;

public class Main {
    public static void main(String[] args) {
        print("Enter array length");

        int length = getIntFromUser();
        double[] array = generateRealNumbersArray(length);

        print("Initial array:");
        print(array);

        int negativeCount = 0;
        int zeroCount = 0;
        int positiveCount = 0;

        for (int i = 0; i < length; i++) {
            if (array[i] < 0) {
                negativeCount++;
            } else if (array[i] > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }

        print("The array contains " + negativeCount + " negative numbers, " +
                positiveCount + " positive numbers, " + zeroCount + " zero numbers");
    }
}
