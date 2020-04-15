package part04.task01;

import static interaction.Interaction.getPositiveInt;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 2 integers");
        int a = getPositiveInt();
        int b = getPositiveInt();
        int gcd = calculateGcd(a, b);
        int lcm = calculateLcm(gcd, a, b);
        System.out.println("Greatest common divisor: " + gcd);
        System.out.println("Less common multiple: " + lcm);
    }

    public static int calculateGcd(int a, int b) {
        return b == 0 ? a : calculateGcd(b, a % b);
    }

    private static int calculateLcm(int gcd, int a, int b) {
        return a / gcd * b;
    }
}