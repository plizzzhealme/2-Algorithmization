package io.github.plizzzhealme.part01.task10;

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
        compress(arr);
        System.out.println("Final array:");
        print(arr);
    }

    private static void compress(int[] arr) {
        int length = arr.length;
        int halfLength = length - length / 2;

        for (int i = 1; i < length; i++) {
            arr[i] = i < halfLength ? arr[i * 2] : 0;
        }
    }
}