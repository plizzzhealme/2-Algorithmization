package part03.task04;

import static cleaner.Cleaner.*;

public class Main {
    public static void main(String[] args) {
        print("Enter array length");
        int length = getIntFromUser();
        int[] array = generateIntegersArray(length);
        print("Initial array:");
        print(array);

        int swapCount = 0;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;

            for (int i = 0; i < length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                    swapCount++;
                }
            }
        }

        print(swapCount + " swaps done. Sorted array:");
        print(array);
    }
}
