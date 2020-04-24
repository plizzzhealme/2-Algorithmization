package io.github.plizzzhealme.part04.task15;

import static io.github.plizzzhealme.interaction.Interaction.getPositiveInt;

public class Main {
    public static void main(String[] args) {
        int length;

        System.out.println("Enter number's length");
        length = getPositiveInt();

        if (length <= 9) {
            printNumbers(length);
        } else {
            System.out.println("Empty set");
        }
    }

    private static void printNumbers(int length) {
        int n = calcFirstNumber(length);
        int[] number = toArray(n, length);

        System.out.println(n);

        while (hasNextSet(number)) {
            changeSet(number);
            System.out.println(toInt(number));
        }
    }

    private static int calcFirstNumber(int length) {
        return length == 1 ? 1 : (10 * calcFirstNumber(length - 1) + length);
    }

    private static int[] toArray(int n, int length) {
        int[] number = new int[length];

        for (int i = length - 1; i >= 0; i--) {
            number[i] = n % 10;
            n /= 10;
        }
        return number;
    }

    private static int toInt(int[] number) {
        int l = number.length;
        int n = 0;

        for (int i = 0; i < l; i++) {
            int p = l - i - 1;
            n += number[i] * Math.pow(10, p);
        }
        return n;
    }

    private static boolean hasNextSet(int[] number) {
        return number[0] < (10 - number.length);
    }

    private static void changeSet(int[] number) {
        int length = number.length;
        boolean isChanged = false;
        int i = length - 1;

        while (!isChanged && i >= 0) {
            int maxValue = 10 - length + i;

            if (number[i] < maxValue) {
                number[i]++;

                for (int j = i + 1; j < length; j++) {
                    number[j] = number[j - 1] + 1;
                }
                isChanged = true;
            }
            i--;
        }
    }
}