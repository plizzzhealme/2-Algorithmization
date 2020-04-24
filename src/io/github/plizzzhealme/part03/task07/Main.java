package io.github.plizzzhealme.part03.task07;

import java.util.Arrays;

import static io.github.plizzzhealme.interaction.Interaction.*;

public class Main {
    public static void main(String[] args) {
        int length1;
        int length2;
        int[] arr1;
        int[] arr2;
        int[] indexes;

        System.out.println("Enter arrays lengths");
        length1 = getPositiveInt();
        length2 = getPositiveInt();
        arr1 = buildIntsArray(length1);
        arr2 = buildIntsArray(length2);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("Initial arrays:");
        print(arr1);
        print(arr2);
        indexes = findInsertIndexes(arr1, arr2);
        System.out.println("Indexes to insert:");
        print(indexes);
    }

    private static int[] findInsertIndexes(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] indexes = new int[length2];
        int i = 0;
        int j = 0;

        while (j < length2) {
            if (i == length1 || arr2[j] < arr1[i]) {
                indexes[j] = i + j;
                j++;
            } else {
                i++;
            }
        }
        return indexes;
    }
}