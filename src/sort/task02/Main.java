package sort.task02;

import java.util.Random;

import static cleaner.Cleaner.getIntFromUser;
import static cleaner.Cleaner.print;

public class Main {
    public static void main(String[] args) {
        print("Enter first array length");

        int firstLength = getIntFromUser();

        print("Enter second array length");

        int secondLength = getIntFromUser();

        int[] firstArray = new int[firstLength];
        Random random = new Random();

        firstArray[0] = random.nextInt(13);

        for (int i = 1; i < firstLength; i++) {
            firstArray[i] = firstArray[i - 1] + random.nextInt(13);
        }

        int[] secondArray = new int[secondLength];

        secondArray[0] = random.nextInt(13);

        for (int i = 1; i < secondLength; i++) {
            secondArray[i] = secondArray[i - 1] + random.nextInt(13);
        }

        print("Initial arrays:");
        print(firstArray);
        print(secondArray);

        int[] array = new int[firstLength + secondLength];
        int i = 0;
        int j = 0;

        while (i < firstLength || j < secondLength) {
            if (i == firstLength) {
                while (j < secondLength) {
                    array[i + j] = secondArray[j];
                    j++;
                }
            } else if (j == secondLength) {
                while (i < firstLength) {
                    array[i + j] = firstArray[i];
                    i++;
                }
            } else if (firstArray[i] < secondArray[j]) {
                array[i + j] = firstArray[i];
                i++;
            } else {
                array[i + j] = secondArray[j];
                j++;
            }
        }

        print("Final array:");
        print(array);
    }
}