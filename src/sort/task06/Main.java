package sort.task06;

import static cleaner.Cleaner.*;

public class Main {
    public static void main(String[] args) {
        print("Enter array length");
        int length = getIntFromUser();
        int[] array = generateIntegersArray(length);
        print("Initial array:");
        print(array);
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 1; i < length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    i--;
                    isSorted = false;
                }
            }
        }

        print(array);
    }
}
