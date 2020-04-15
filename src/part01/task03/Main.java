package part01.task03;

import static interaction.Interaction.*;

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
        String resultFormat = "The array contains %d negative numbers," +
                              " %d positive numbers, %d zero numbers%n";

        for (double value : arr) {
            if (value < 0) {
                negativeCount++;
            } else if (value > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.printf(resultFormat, negativeCount, positiveCount, zeroCount);
    }
}