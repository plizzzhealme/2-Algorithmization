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

    private static int sort(int[] array) {
        int length = array.length;
        int swapCount = 0;
        boolean sorted = false;
        int temp;

        while (!sorted) {
            sorted = true;

            for (int i = 0; i < length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                    swapCount++;
                }
            }
        }
        return swapCount;
    }
}