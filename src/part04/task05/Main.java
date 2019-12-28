package part04.task05;

import static cleaner.Cleaner.*;

public class Main {
    public static void main(String[] args) {
        print("Enter the number of numbers o_O");
        int n = getIntFromUser();
        int[] numbers = generateNaturalNumbersArray(n);
        print("Numbers:");
        print(numbers);
        print("The second largest number is " + findSecondLargestNumber(numbers));
    }

    /*
    returns the second largest number in the array,
    if all numbers are equal returns this single value
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