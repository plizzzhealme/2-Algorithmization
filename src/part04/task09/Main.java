package part04.task09;

import static cleaner.Cleaner.getNaturalNumberFromUser;
import static cleaner.Cleaner.print;

public class Main {
    public static void main(String[] args) {
        print("Enter the lengths of the sides");
        int x = getNaturalNumberFromUser();
        int y = getNaturalNumberFromUser();
        int z = getNaturalNumberFromUser();
        int t = getNaturalNumberFromUser();
        double s = calculateArea(x, y, z, t);

        if (s == -1) {
            print("Quadrilateral with given sides doesn't exist");
        } else {
            System.out.printf("S = %.3f", s);
        }
    }

    /*
    returns the area or -1 if quadrangle doesn't exist
     */
    private static double calculateArea(int x, int y, int z, int t) {
        double diagonal = calculateHypotenuse(x, y);

        if (checkTriangle(diagonal, z, t)) {
            return calculateTriangleArea(diagonal, z, t) + calculateRightTriangleArea(x, y);
        } else {
            return -1;
        }
    }

    /*
    calculates the length of hypotenuse if legs are given
     */
    private static double calculateHypotenuse(double leg1, double leg2) {
        return Math.sqrt(leg1 * leg1 + leg2 * leg2);
    }

    /*
    checks whether triangle with given sides is valid or not
     */
    private static boolean checkTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    /*
    calculates right-angled triangle area with given legs
     */
    private static double calculateRightTriangleArea(double leg1, double leg2) {
        return leg1 * leg2 / 2;
    }

    /*
    calculates the area of the triangle with given sides
     */
    private static double calculateTriangleArea(double a, double b, double c) {
        double p = calculateHalfPerimeter(a, b, c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    /*
    calculates half perimeter of triangle
     */
    private static double calculateHalfPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }
}