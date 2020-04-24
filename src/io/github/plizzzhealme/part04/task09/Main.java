package io.github.plizzzhealme.part04.task09;

import static io.github.plizzzhealme.interaction.Interaction.getPositiveDouble;

public class Main {
    public static void main(String[] args) {
        double x;
        double y;
        double z;
        double t;
        double d;
        double xydArea;
        double ztdArea;
        double convexArea;
        double concaveArea;

        System.out.println("Enter the lengths of the sides");
        x = getPositiveDouble();
        y = getPositiveDouble();
        z = getPositiveDouble();
        t = getPositiveDouble();
        d = calcHypotenuse(x, y);

        if (z + t > d) {
            xydArea = calcTriangleArea(x, y, d);
            ztdArea = calcTriangleArea(z, t, d);
            convexArea = xydArea + ztdArea;
            System.out.printf("For convex quadrilateral: S = %.2f%n", convexArea);

            if (canBeConcave(x, y, z, t, d)) {
                concaveArea = xydArea - ztdArea;
                System.out.printf("For concave quadrilateral: S = %.2f%n", concaveArea);
            } else {
                System.out.println("Concave quadrilateral doesn't exist");
            }
        } else {
            System.out.println("Such quadrilateral doesn't exist");
        }

    }

    private static double calcHypotenuse(double leg1, double leg2) {
        return Math.sqrt(leg1 * leg1 + leg2 * leg2);
    }

    private static double calcTriangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private static boolean canBeConcave(double x, double y, double z, double t, double d) {
        double xd = calcAngle(y, x, d);
        double yd = calcAngle(x, y, d);
        double zd = calcAngle(t, z, d);
        double td = calcAngle(z, t, d);

        return zd < xd && td < yd || zd < yd && td < xd;
    }

    private static double calcAngle(double a, double b, double c) {
        return Math.acos((b * b + c * c - a * a) / (2 * b * c)) * 180 / Math.PI;
    }
}