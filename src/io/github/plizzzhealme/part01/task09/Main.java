package io.github.plizzzhealme.part01.task09;

import static io.github.plizzzhealme.interaction.Interaction.*;

public class Main {
    public static void main(String[] args) {
        int length;
        int[] arr;
        int mostFrequentNumber;

        System.out.println("Enter array length");
        length = getPositiveInt();
        arr = buildIntsArray(length);
        mostFrequentNumber = findMostFrequentNumber(arr);
        System.out.println("Initial array:");
        print(arr);
        System.out.printf("The min of the most frequently occurring numbers is %d", mostFrequentNumber);
    }

    private static int findMostFrequentNumber(int[] arr) {
        int length = arr.length;
        boolean[] isChecked = new boolean[length];
        int mostFrequentNumber = arr[0];
        int maxFrequency = 1;

        for (int i = 0; i < length; i++) {
            if (!isChecked[i]) {
                int currentFrequency = 0;

                for (int j = i; j < length; j++) {
                    if (arr[i] == arr[j]) {
                        currentFrequency++;
                        isChecked[j] = true;
                    }
                }

                if (currentFrequency > maxFrequency) {
                    maxFrequency = currentFrequency;
                    mostFrequentNumber = arr[i];
                } else if (currentFrequency == maxFrequency) {
                    mostFrequentNumber = Math.min(mostFrequentNumber, arr[i]);
                }
            }
        }
        return mostFrequentNumber;
    }
}