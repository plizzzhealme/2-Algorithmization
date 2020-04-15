package part03.task01;

import static interaction.Interaction.*;

public class Main {
    public static void main(String[] args) {
        int k;
        int index;
        int length1;
        int length2;
        int[] arr1;
        int[] arr2;
        int[] arr;

        System.out.println("Enter arrays lengths");
        length1 = getPositiveInt();
        arr1 = buildIntsArray(length1);
        length2 = getPositiveInt();
        arr2 = buildIntsArray(length2);
        System.out.println("Initial arrays:");
        print(arr1);
        print(arr2);
        System.out.println("Enter k");
        k = getPositiveInt();
        index = k - 1;

        if (length1 <= index || index < 0) {
            System.out.println("Array index out of bounds");
        } else {
            arr = merge(arr1, arr2, index);
            System.out.println("Final array:");
            print(arr);
        }
    }

    private static int[] merge(int[] arr1, int[] arr2, int index) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int length = length1 + length2;
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            if (i <= index) {
                arr[i] = arr1[i];
            } else if (i <= index + length2) {
                arr[i] = arr2[i - index - 1];
            } else {
                arr[i] = arr1[i - length2];
            }
        }
        return arr;
    }
}