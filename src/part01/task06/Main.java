package part01.task06;

import static cleaner.Cleaner.*;

public class Main {
    public static void main(String[] args) {
        print("Enter array length");

        int length = getIntFromUser();
        double[] array = generateRealNumbersArray(length);

        print("Initial array:");
        print(array);

        /*
        Sieve of Eratosthenes algorithm
         */
        int firstPrime = 2;
        boolean[] primeTags = new boolean[length];

        for (int i = firstPrime; i < length; i++) {
            primeTags[i] = true;
        }

        for (int i = firstPrime; i * i < length; i++) {
            if (primeTags[i]) {
                for (int j = i * i; j < length; j += i) {
                    primeTags[j] = false;
                }
            }
        }

        double sum = 0;

        for (int i = 0; i < length; i++) {
            if (primeTags[i]) {
                sum += array[i];
            }
        }

        System.out.printf("Prime indexes sum = %.2f", sum);
    }
}
