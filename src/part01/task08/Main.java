package part01.task08;

import static cleaner.Cleaner.*;

public class Main {
    public static void main(String[] args) {
        print("Enter array length");

        int length = getIntFromUser();
        int[] array = generateIntegersArray(length);

        print("Initial array:");
        print(array);

        int min = array[0];

        for (int i = 1; i < length; i++) {
            min = Math.min(min, array[i]);
        }

        int finalArrayLength = 0;

        for (int i = 0; i < length; i++) {
            if (array[i] != min) {
                finalArrayLength++;
            }
        }

        int[] finalArray = new int[finalArrayLength];

        for (int i = 0, j = 0; i < length; i++) {
            if (array[i] != min) {
                finalArray[j] = array[i];
                j++;
            }
        }

        print("Final array without minimum elements:");
        print(finalArray);
    }
}
