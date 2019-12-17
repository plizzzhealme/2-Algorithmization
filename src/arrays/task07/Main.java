package arrays.task07;

import static cleaner.Cleaner.*;

public class Main {
    public static void main(String[] args) {
        print("Enter half of an array length");

        int halfLength = getIntFromUser();
        int length = halfLength * 2;
        double[] array = generateRealNumbersArray(length);

        print("Initial array:");
        print(array);

        double maxPairSum = array[0] + array[length - 1];

        for (int i = 1; i < halfLength; i++) {
            double sum = array[i] + array[length - 1 - i];
            maxPairSum = Math.max(maxPairSum, sum);
        }

        System.out.printf("Max pair sum = %.2f", maxPairSum);
    }
}
