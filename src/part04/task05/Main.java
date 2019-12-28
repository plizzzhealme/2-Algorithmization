package part04.task05;

import static cleaner.Cleaner.*;

public class Main {
    public static void main(String[] args) {
        print("Enter array length");

        int length = getIntFromUser();
        int[] numbers = generateNaturalNumbersArray(length);
        print("Numbers:");
        print(numbers);
        print("The second largest number is " + findSecondLargestNumber(numbers));
    }

    /*
    returns the second largest number in the array,
    if all numbers are equal returns their value
     */
    private static int findSecondLargestNumber(int[] numbers) {
        int n = numbers.length;

        if (n == 1) {
            return numbers[0];
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i : numbers) {
            if (max < i) {
                secondMax = max;
                max = i;
            } else if (secondMax < i && max != i) {
                secondMax = i;
            }
        }
        return secondMax;
    }
}