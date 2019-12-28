package part01.task09;

import static cleaner.Cleaner.*;

public class Main {
    public static void main(String[] args) {
        print("Enter array length");

        int length = getIntFromUser();
        int[] array = generateIntegersArray(length);

        print("Initial array:");
        print(array);

        int mostFrequentNumber = array[0];
        int maxFrequency = 1;
        int currentFrequency;

        for (int i = 0; i < length; i++) {
            currentFrequency = 0;

            for (int j = i; j < length; j++) {
                if (array[i] == array[j]) {
                    currentFrequency++;
                }
            }

            if (currentFrequency >= maxFrequency) {
                maxFrequency = currentFrequency;
                mostFrequentNumber = Math.min(mostFrequentNumber, array[i]);
            }
        }

        print("The minimum of the most frequently occurring numbers is " + mostFrequentNumber);
    }
}
