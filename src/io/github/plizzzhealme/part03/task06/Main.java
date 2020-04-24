package io.github.plizzzhealme.part03.task06;

import static io.github.plizzzhealme.interaction.Interaction.*;

public class Main {
    public static void main(String[] args) {
        int length;
        int[] arr;

        System.out.println("Enter array length");
        length = getPositiveInt();
        arr = buildIntsArray(length);
        System.out.println("Initial array:");
        print(arr);
        sort(arr);
        System.out.println("Sorted array:");
        print(arr);
    }

    private static void sort(int[] arr) {
        int length = arr.length;
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            int i = 1;

            while (i < length) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    i--;
                    isSorted = false;
                }
                i++;
            }
        }
    }
}