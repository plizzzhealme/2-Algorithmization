package io.github.plizzzhealme.part04.task17;

import static io.github.plizzzhealme.interaction.Interaction.getPositiveInt;

public class Main {
    public static void main(String[] args) {
        int n;
        int count;

        System.out.println("Enter positive integer:");
        n = getPositiveInt();
        count = countSubtraction(n);
        System.out.printf("You have to subtract %d time%s", count, count == 1 ? "" : "s");

    }

    private static int countSubtraction(int n) {
        int count = 0;
        int temp = n;

        while (temp != 0) {
            count++;
            temp -= io.github.plizzzhealme.part04.task12.Main.calcDigitsSum(temp);
        }
        return count;
    }
}