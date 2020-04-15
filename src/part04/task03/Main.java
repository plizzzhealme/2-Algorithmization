package part04.task03;

import static interaction.Interaction.getDouble;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the length of the side of the hexagon");
        double a = getDouble();
        System.out.println("Hexagon's square: " + calculateAreaOfHexagon(a));
    }

    private static double calculateAreaOfEquilateralTriangle(double a) {
        return Math.sqrt(3.) / 4 * a * a;
    }

    private static double calculateAreaOfHexagon(double a) {
        return 6 * calculateAreaOfEquilateralTriangle(a);
    }
}
