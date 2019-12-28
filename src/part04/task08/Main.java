package part04.task08;

import static cleaner.Cleaner.*;

public class Main {
    public static void main(String[] args) {
        print("Enter array length");

        int length = getIntFromUser();
        int[] array = generateNaturalNumbersArray(length);

        print("Initial array:");
        print(array);
        print("Enter the number of the first element to calculate the sum");

        int n = getNaturalNumberFromUser();
        int index = n - 1;

        if (checkIndex(array, index)) {
            print("Sum = " + threeSum(array, index));
        } else {
            print("Index too large or array too small");
        }
    }

    private static int threeSum(int[] array, int startIndex) {
        return array[startIndex] + array[startIndex + 1] + array[startIndex + 2];
    }

    private static boolean checkIndex(int[] array, int index) {
        int length = array.length;
        return index + 2 < length;
    }
}