package io.github.plizzzhealme.part01.task09;

import static io.github.plizzzhealme.interaction.Interaction.*;

/*
Дан массив целых чисел. Найти наиболее часто встречающееся число.
Если таких чисел несколько, то найти наименьшее из них
 */
public class Main {
    public static void main(String[] args) {
        int length;
        int[] arr;
        int mostFrequentNumber;

        System.out.println("Enter array length");
        length = getPositiveInt();

        arr = buildIntsArray(length);

        System.out.println("Initial array:");
        print(arr);

        mostFrequentNumber = findMostFrequentNumber(arr);

        System.out.printf("The min of the most frequently occurring numbers is %d", mostFrequentNumber);
    }

    private static int findMostFrequentNumber(int[] arr) {
        int length = arr.length;
        boolean[] checked = new boolean[length];
        int mostFrequentNumber = arr[0];
        int maxFrequency = 1;

        for (int i = 0; i < length; i++) {
            if (!checked[i]) {
                int currentFrequency = 0;

                for (int j = i; j < length; j++) {
                    if (arr[i] == arr[j]) {
                        currentFrequency++;
                        checked[j] = true;
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