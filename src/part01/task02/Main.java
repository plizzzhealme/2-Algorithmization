package part01.task02;

import static cleaner.Cleaner.*;

public class Main {
    public static void main(String[] args) {
        print("Enter array length");

        int length = getIntFromUser();
        double[] array = generateRealNumbersArray(length);

        print("Initial array:");
        print(array);
        print("Enter Z");

        double z = getRealNumberFromUser();
        int replacementCount = 0;

        for (int i = 0; i < length; i++) {
            if (array[i] > z) {
                array[i] = z;
                replacementCount++;
            }
        }

        print(replacementCount + " numbers have been replaced by Z = " + z);
        print("Final array:");
        print(array);
    }
}
