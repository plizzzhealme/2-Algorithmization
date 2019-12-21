package sort.task05;

import static cleaner.Cleaner.*;

public class Main {
    public static void main(String[] args) {
        print("Enter array length");
        int length = getIntFromUser();
        int[] array = generateIntegersArray(length);
        print("Initial array:");
        print(array);

        for (int i = 1; i < length; i++) {
            int elementToInsert = array[i];
            int insertionIndex = search(array, i, elementToInsert);

            //noinspection ManualArrayCopy
            for (int j = i - 1; j >= insertionIndex; j--) {
                array[j + 1] = array[j];
            }
            array[insertionIndex] = elementToInsert;
        }

        print("Sorted array:");
        print(array);
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