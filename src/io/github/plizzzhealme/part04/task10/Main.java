package io.github.plizzzhealme.part04.task10;

import static io.github.plizzzhealme.interaction.Interaction.getPositiveInt;
import static io.github.plizzzhealme.interaction.Interaction.print;

public class Main {
    public static void main(String[] args) {
        int n;
        int[] number;

        System.out.println("Enter positive integer");
        n = getPositiveInt();
        number = toArray(n);
        print(number);
    }

    private static int[] toArray(int n) {
        int length = calcNumberLength(n);
        int[] number = new int[length];
        int temp = Math.abs(n);

        for (int i = length - 1; i >= 0; i--) {
            number[i] = temp % 10;
            temp /= 10;
        }
        return number;
    }

    public static int calcNumberLength(int n) {
        int abs = Math.abs(n);
        int[] sizeTable = {9, 99, 999, 9999, 99999, 999999, 9999999,
                99999999, 999999999, Integer.MAX_VALUE};

        for (int i = 0; ; i++) {
            if (abs <= sizeTable[i]) {
                return i + 1;
            }
        }
    }
}