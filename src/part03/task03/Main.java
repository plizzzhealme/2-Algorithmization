package part03.task03;

import static interaction.Interaction.*;

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
        int temp;

        for (int i = 0; i < length - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }
}