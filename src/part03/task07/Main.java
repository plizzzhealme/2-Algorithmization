package part03.task07;

import java.util.Arrays;

import static cleaner.Cleaner.*;

public class Main {
    public static void main(String[] args) {
        print("Enter 1st sequence length");

        int firstLength = getNaturalNumberFromUser();
        int[] a = generateIntegersArray(firstLength);

        print("Enter 2nd sequence length");

        int secondLength = getNaturalNumberFromUser();
        int[] b = generateIntegersArray(secondLength);

        Arrays.sort(a);
        Arrays.sort(b);
        print("Sequence A:");
        print(a);
        print("Sequence B:");
        print(b);

        int i = 0;
        int j = 0;
        int[] indexes = new int[secondLength];

        while (j < secondLength) {
            if (i == firstLength || b[j] < a[i]) {
                indexes[j] = i + j + 1;
                j++;
            } else {
                i++;
            }
        }
        print("Numbers of places to insert sequence B in a new sequence:");
        print(indexes);
    }
}
