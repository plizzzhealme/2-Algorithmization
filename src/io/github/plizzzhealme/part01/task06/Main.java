package io.github.plizzzhealme.part01.task06;

import static io.github.plizzzhealme.interaction.Interaction.*;

public class Main {
    public static void main(String[] args) {
        int length;
        double[] arr;
        double sum;

        System.out.println("Enter array length");
        length = getPositiveInt();
        arr = buildDoublesArray(length);
        System.out.println("Initial array:");
        print(arr);
        sum = calcPrimeIndexesSum(arr);
        System.out.printf("Prime indexes sum = %.2f", sum);
    }

    private static double calcPrimeIndexesSum(double[] arr) {
        int length = arr.length;
        boolean[] isPrime = buildPrimesTable(length);
        double sum = 0;

        for (int i = 0; i < length; i++) {
            if (isPrime[i]) {
                sum += arr[i];
            }
        }
        return sum;
    }

    private static boolean[] buildPrimesTable(int size) {
        boolean[] isPrime = new boolean[size];

        for (int i = 1; i < size; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= size; i++) {
            if (isPrime[i - 1]) {
                for (int j = i * i; j <= size; j += i) {
                    isPrime[j - 1] = false;
                }
            }
        }
        return isPrime;
    }
}