package part03.task04;

import static interaction.Interaction.*;

public class Main {
    public static void main(String[] args) {
        int length;
        int[] arr;
        int swapCount;

        System.out.println("Enter array length");
        length = getPositiveInt();
        arr = buildIntsArray(length);
        System.out.println("Initial array:");
        print(arr);
        swapCount = sort(arr);
        System.out.printf("%d swaps done. Sorted array:%n", swapCount);
        print(arr);
    }

    private static int sort(int[] arr) {
        int length = arr.length;
        int swapCount = 0;
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = false;
                    swapCount++;
                }
            }
        }
        return swapCount;
    }
}