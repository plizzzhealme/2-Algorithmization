package part01.task04;

import static cleaner.Cleaner.*;

public class Main {
    public static void main(String[] args) {
        print("Enter array length");

        int length = getIntFromUser();
        double[] array = generateRealNumbersArray(length);

        print("Initial array:");
        print(array);

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            } else if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        double temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        print("Final array:");
        print(array);
    }
}