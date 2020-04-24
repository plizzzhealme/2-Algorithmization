package io.github.plizzzhealme.part01.task03;

import static io.github.plizzzhealme.interaction.Interaction.*;

public class Main {
    public static void main(String[] args) {
        int length;
        double[] arr;

        System.out.println("Enter array length");
        length = getPositiveInt();
        arr = buildDoublesArray(length);
        System.out.println("Initial array:");
        print(arr);
        printSignInfo(arr);
    }

    private static void printSignInfo(double[] arr) {
        int negativeCount = 0;
        int zeroCount = 0;
        int positiveCount = 0;
        String pattern = "Negative: %d, positive: %d, zero: %d";

        for (double value : arr) {
            if (value < 0) {
                negativeCount++;
            } else if (value > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.printf(pattern, negativeCount, positiveCount, zeroCount);
    }
}