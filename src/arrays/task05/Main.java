package arrays.task05;

import static cleaner.Cleaner.*;

public class Main {
    public static void main(String[] args) {
        print("Enter array length");

        int length = getIntFromUser();
        int[] array = generateIntegersArray(length);

        print("Initial array:");
        print(array);
        print("Numbers matching a[i] > i:");

        for (int i = 0; i < length; i++) {
            if (array[i] > i) {
                print(String.valueOf(array[i]));
            }
        }
    }
}
