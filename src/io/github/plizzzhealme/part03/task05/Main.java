package io.github.plizzzhealme.part03.task05;

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

        for (int i = 1; i < length; i++) {
            int elementToInsert = arr[i];
            int insertionIndex = search(arr, i, elementToInsert);

            //noinspection ManualArrayCopy
            for (int j = i - 1; j >= insertionIndex; j--) {
                arr[j + 1] = arr[j];
            }
            arr[insertionIndex] = elementToInsert;
        }
    }

    private static int search(int[] array, int toIndex, int key) {
        int low = 0;
        int high = toIndex - 1;

        while (low <= high) {
            int middle = (low + high) / 2;
            int midVal = array[middle];

            if (midVal < key) {
                low = middle + 1;
            } else if (midVal > key) {
                high = middle - 1;
            } else {
                return middle + 1;
            }
        }
        return low;
    }
}