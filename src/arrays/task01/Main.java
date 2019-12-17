package arrays.task01;

import static cleaner.Cleaner.*;

public class Main {
    public static void main(String[] args) {
        print("Enter array length");

        int length = getIntFromUser();
        int[] array = generateNaturalNumbersArray(length);

        print("Initial array:");
        print(array);
        print("Enter K");

        int k = getIntFromUser();
        int sum = 0;

        for (int i = 0; i < length; i++) {
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }

        print("K multiples sum = " + sum);
    }
}