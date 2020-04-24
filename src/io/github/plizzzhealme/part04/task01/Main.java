package io.github.plizzzhealme.part04.task01;

import static io.github.plizzzhealme.interaction.Interaction.getPositiveInt;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int gcd;
        int lcm;

        System.out.println("Enter 2 integers");
        a = getPositiveInt();
        b = getPositiveInt();
        gcd = calcGcd(a, b);
        lcm = calcLcm(gcd, a, b);
        System.out.printf("Greatest common divisor = %d, least common multiple = %d", gcd, lcm);
    }

    public static int calcGcd(int a, int b) {
        return b == 0 ? a : calcGcd(b, a % b);
    }

    private static int calcLcm(int gcd, int a, int b) {
        return a / gcd * b;
    }
}