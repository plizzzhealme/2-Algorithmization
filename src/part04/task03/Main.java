package part04.task03;

import static interaction.Interaction.getPositiveInt;

public class Main {
    public static void main(String[] args) {
        int a;
        double s;

        System.out.println("Enter side length");
        a = getPositiveInt();
        s = calcHexagonArea(a);
        System.out.printf("S = %s", s);
    }

    private static double calcHexagonArea(double a) {
        return 6 * calcTriangleArea(a);
    }

    private static double calcTriangleArea(double a) {
        return (Math.sqrt(3) / 4) * a * a;
    }
}