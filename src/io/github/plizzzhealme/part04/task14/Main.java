package io.github.plizzzhealme.part04.task14;

import static io.github.plizzzhealme.interaction.Interaction.getPositiveInt;

public class Main {
    public static void main(String[] args) {
        int k;

        System.out.println("Enter positive integer");
        k = getPositiveInt();
        System.out.printf("Armstrong numbers in the interval [1;%d]:%n", k);
        printArmstrongNumbers(k);
    }

    private static void printArmstrongNumbers(int bound) {
        for (int i = 1; i <= bound; i++) {
            int sum = io.github.plizzzhealme.part04.task12.Main.calcDigitsSum(i);
            int length = io.github.plizzzhealme.part04.task10.Main.calcNumberLength(i);

            if (Math.pow(sum, length) == i) {
                System.out.println(i);
            }
        }
    }
}