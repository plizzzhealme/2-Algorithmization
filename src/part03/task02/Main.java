package part03.task02;

import java.util.Arrays;

import static interaction.Interaction.*;

public class Main {
    public static void main(String[] args) {
        int length1;
        int length2;
        int[] arr1;
        int[] arr2;
        int[] arr;

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
        arr = merge(arr1, arr2);
        System.out.println("Final array:");
        print(arr);
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] arr = new int[length1 + length2];
        int i1 = 0;
        int i2 = 0;

        while (i1 < length1 || i2 < length2) {
            if (i1 == length1) {
                while (i2 < length2) {
                    arr[i1 + i2] = arr2[i2];
                    i2++;
                }
            } else if (i2 == length2) {
                while (i1 < length1) {
                    arr[i1 + i2] = arr1[i1];
                    i1++;
                }
            } else if (arr1[i1] < arr2[i2]) {
                arr[i1 + i2] = arr1[i1];
                i1++;
            } else {
                arr[i1 + i2] = arr2[i2];
                i2++;
            }
        }
        return arr;
    }
}