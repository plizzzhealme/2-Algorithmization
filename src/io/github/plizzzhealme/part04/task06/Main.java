package io.github.plizzzhealme.part04.task06;

import static io.github.plizzzhealme.interaction.Interaction.getPositiveInt;

public class Main {
    public static void main(String[] args) {
        int n = 3;
        int[] numbers = new int[n];
        boolean isCoPrime;

        System.out.println("Enter 3 integers");

        for (int i = 0; i < n; i++) {
            numbers[i] = getPositiveInt();
        }
        isCoPrime = isCoPrime(numbers);
        System.out.println(isCoPrime ? "Co-prime" : "Not co-prime");
    }

    /*
    Uses the method from the previous task
     */
    private static boolean isCoPrime(int[] numbers) {
        return io.github.plizzzhealme.part04.task02.Main.calculateMultipleGcd(numbers) == 1;
    }
}