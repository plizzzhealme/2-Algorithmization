package arrays.task03;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter array size");

        Scanner in = new Scanner(System.in);
        int arrayLength = in.nextInt();
        double[] array = new double[arrayLength];
        int bound = 42;
        Random random = new Random();

        for (int i = 0; i < arrayLength; i++) {
            array[i] = random.nextDouble() * bound * 2 - bound;
        }

        System.out.print("Initial array:");

        for (int i = 0; i < arrayLength; i++) {
            System.out.printf("%.2f ", array[i]);
        }

        System.out.println();

        int negativeCount = 0;
        int zeroCount = 0;
        int positiveCount = 0;

        for (int i = 0; i < arrayLength; i++) {
            if (array[i] < 0) {
                negativeCount++;
            } else if (array[i] > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("The array contains " + negativeCount + " negative numbers, " +
                positiveCount + " positive numbers, " + zeroCount + " zero numbers");
    }
}
