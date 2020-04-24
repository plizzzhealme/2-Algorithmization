package io.github.plizzzhealme.part01.task07;

import static io.github.plizzzhealme.interaction.Interaction.*;

public class Main {
    public static void main(String[] args) {
        int halfLength;
        int length;
        double[] arr;
        double maxPairSum;

        System.out.println("Enter half of an array length");
        halfLength = getPositiveInt();
        length = halfLength * 2;
        arr = buildDoublesArray(length);
        System.out.println("Initial array:");
        print(arr);
        maxPairSum = findMaxPairSum(arr);
        System.out.printf("Max pair sum = %.2f", maxPairSum);
    }

    private static double findMaxPairSum(double[] arr) {
        int length = arr.length;
        int halfLength = length / 2;
        double maxPairSum = arr[0] + arr[length - 1];

        for (int i = 1; i < halfLength; i++) {
            double sum = arr[i] + arr[length - 1 - i];
            maxPairSum = Math.max(maxPairSum, sum);
        }
        return maxPairSum;
    }
}