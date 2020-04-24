package io.github.plizzzhealme.part01.task05;

import static io.github.plizzzhealme.interaction.Interaction.*;

/*
Дан массив целых чисел. Вывести те, для которых a[i]>i
 */
public class Main {
    public static void main(String[] args) {
        int length;
        int[] arr;

        System.out.println("Enter array length");
        length = getPositiveInt();

        arr = buildIntsArray(length);

        System.out.println("Initial array:");
        print(arr);

        System.out.println("Numbers matching a[i] > i:");
        printMatchingNumbers(arr);
    }

    private static void printMatchingNumbers(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            if (arr[i] > i) {
                System.out.println(arr[i]);
            }
        }
    }
}