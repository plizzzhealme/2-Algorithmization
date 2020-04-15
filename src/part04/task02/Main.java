package part04.task02;

import static interaction.Interaction.getPositiveInt;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 4 integers");
        int length = 4;
        int[] numbers = new int[4];

        for (int i = 0; i < length; i++) {
            numbers[i] = getPositiveInt();
        }
        int gcd = calculateMultipleGcd(numbers);
        System.out.println("Greatest common divisor: " + gcd);
    }

    /*
    uses the method from the previous task
     */
    public static int calculateMultipleGcd(int[] numbers) {
        int length = numbers.length;
        int gcd = part04.task01.Main.calculateGcd(numbers[0], numbers[1]);

        for (int i = 2; i < length; i++) {
            gcd = part04.task01.Main.calculateGcd(gcd, numbers[i]);
        }
        return gcd;
    }
}
