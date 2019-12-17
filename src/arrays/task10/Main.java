package arrays.task10;

import static cleaner.Cleaner.*;

public class Main {
    public static void main(String[] args) {
        print("Enter array length");

        int length = getIntFromUser();
        int[] array = generateIntegersArray(length);

        print("Initial array:");
        print(array);

        int subArrayLength = length / 2;

        if (length % 2 == 1) {
            subArrayLength++;
        }

        for (int i = 1; i < subArrayLength; i++) {
            array[i] = array[i * 2];
        }

        for (int i = subArrayLength; i < length; i++) {
            array[i] = 0;
        }

        print("Final array:");
        print(array);
    }
}
