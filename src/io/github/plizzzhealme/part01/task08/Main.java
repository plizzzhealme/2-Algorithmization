package io.github.plizzzhealme.part01.task08;

import static io.github.plizzzhealme.interaction.Interaction.*;

/*
Дан массив целых чисел. Образовать новый, выбросив элементы равные минимальному
 */
public class Main {
    public static void main(String[] args) {
        int length;
        int[] arr;
        int[] result;

        System.out.println("Enter array length");
        length = getPositiveInt();

        arr = buildIntsArray(length);

        System.out.println("Initial array:");
        print(arr);

        result = removeMinElements(arr);

        System.out.println("Final array:");
        print(result);
    }

    private static int[] removeMinElements(int[] arr) {
        int resultLength = 0;
        int i = 0;
        int[] result;
        int min = findMin(arr);

        for (int value : arr) {
            if (value != min) {
                resultLength++;
            }
        }
        result = new int[resultLength];

        for (int value : arr) {
            if (value != min) {
                result[i] = value;
                i++;
            }
        }
        return result;
    }

    private static int findMin(int[] arr) {
        int min = arr[0];

        for (int value : arr) {
            min = Math.min(min, value);
        }
        return min;
    }
}