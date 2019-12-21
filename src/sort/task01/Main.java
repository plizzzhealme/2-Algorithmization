package sort.task01;

import static cleaner.Cleaner.*;

public class Main {
    public static void main(String[] args) {
        print("Enter first array length");

        int firstLength = getIntFromUser();
        int[] firstArray = generateIntegersArray(firstLength);

        print("First array:");
        print(firstArray);
        print("Enter second array length");

        int secondLength = getIntFromUser();
        int[] secondArray = generateIntegersArray(secondLength);

        print("Second array:");
        print(secondArray);
        print("Enter k");

        int k = getIntFromUser();

        if (k > firstLength || k < 0) {
            print("Array index out of bounds");
        } else {
            int length = firstLength + secondLength;
            int[] array = new int[length];

            for (int i = 0; i < length; i++) {
                if (i < k) {
                    array[i] = firstArray[i];
                } else if (i < k + secondLength) {
                    array[i] = secondArray[i - k];
                } else {
                    array[i] = firstArray[i - secondLength];
                }
            }

            print("Final array:");
            print(array);
        }
    }
}
