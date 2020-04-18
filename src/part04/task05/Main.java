package part04.task05;

import static interaction.Interaction.*;

public class Main {
    public static void main(String[] args) {
        int n;
        int[] numbers;
        int secondMax;

        System.out.println("Enter the number of numbers o_O");
        n = getInt();
        numbers = buildPositiveIntsArray(n);
        System.out.println("Numbers:");
        print(numbers);
        secondMax = findSecondLargestNumber(numbers);
        System.out.printf("The second largest number is %d", secondMax);
    }

    private static int findSecondLargestNumber(int[] numbers) {
        int n = numbers.length;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        if (n == 1) {
            return numbers[0];
        }

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