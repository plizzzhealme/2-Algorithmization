package part04.task03;

import static cleaner.Cleaner.getRealNumberFromUser;
import static cleaner.Cleaner.print;

public class Main {
    public static void main(String[] args) {
        print("Enter the length of the side of the hexagon");
        double a = getRealNumberFromUser();
        print("Hexagon's square: " + calculateAreaOfHexagon(a));
    }

    private static double calculateAreaOfTriangle(double a) {
        return Math.sqrt(3.) / 4 * a * a;
    }

    private static double calculateAreaOfHexagon(double a) {
        return 6 * calculateAreaOfTriangle(a);
    }
}
