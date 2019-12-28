package part03.task03;

import static cleaner.Cleaner.*;

public class Main {
    public static void main(String[] args) {
        print("Enter array length");
        int length = getIntFromUser();
        int[] array = generateIntegersArray(length);
        print("Initial array:");
        print(array);

        for (int i = 0; i < length - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < length; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = temp;
        }

        print("Sorted array:");
        print(array);
    }
}
