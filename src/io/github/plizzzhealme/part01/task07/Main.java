package io.github.plizzzhealme.part01.task07;

import static io.github.plizzzhealme.interaction.Interaction.*;

/*
Дан массив действительных чисел. Найти max(a_1+a_2n,a_2+a_2n-1,...,a_n+a_n+1)
 */
public class Main {
    public static void main(String[] args) {
        int length;
        double[] arr;
        double maxPairSum;

        System.out.println("Enter array length");
        length = getEvenInt();

        arr = buildDoublesArray(length);

        System.out.println("Initial array:");
        print(arr);

        maxPairSum = findMaxSum(arr);

        System.out.printf("Max pair sum = %.2f", maxPairSum);
    }

    private static double findMaxSum(double[] arr) {
        int length = arr.length;
        int halfLength = length / 2;
        double max = arr[0] + arr[length - 1];

        for (int i = 1; i < halfLength; i++) {
            max = Math.max(max, arr[i] + arr[length - i - 1]);
        }
        return max;
    }
}