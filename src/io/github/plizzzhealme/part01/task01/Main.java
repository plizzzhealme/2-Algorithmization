package io.github.plizzzhealme.part01.task01;

import static io.github.plizzzhealme.interaction.Interaction.*;

/*
Дан массив натуральных чисел. Найти сумму элементов кратных заданному K
 */
public class Main {
    public static void main(String[] args) {
        int[] arr;
        int length;
        int k;
        int sum;

        System.out.println("Enter array length");
        length = getPositiveInt();

        arr = buildPositiveIntsArray(length);

        System.out.println("Initial array:");
        print(arr);

        System.out.println("Enter K");
        k = getInt();

        sum = calcMultiplesSum(arr, k);

        System.out.printf("%d multiples sum = %d", k, sum);
    }

    private static int calcMultiplesSum(int[] arr, int k) {
        int sum = 0;

        for (int value : arr) {
            if (value % k == 0) {
                sum += value;
            }
        }
        return sum;
    }
}