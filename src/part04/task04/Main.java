package part04.task04;

import static interaction.Interaction.buildIntsMatrix;
import static interaction.Interaction.getPositiveInt;

public class Main {
    public static void main(String[] args) {
        int n;
        int[][] points;
        int[][] pair;

        System.out.println("Enter the number of points");
        n = getPositiveInt();
        points = buildIntsMatrix(2, n);
        System.out.println("Points:");
        printPoints(points);

        if (n > 1) {
            pair = findPairAtMaxDistance(points);
            System.out.println("Max distance pair:");
            printPoints(pair);
        }
    }

    private static int calcSquaredDistance(int x1, int y1, int x2, int y2) {
        return (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
    }

    private static int[][] findPairAtMaxDistance(int[][] points) {
        int max1 = 0;
        int max2 = 1;
        int maxDistance = 0;
        int n = points[0].length;
        int[][] result = new int[2][2];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int distance = calcSquaredDistance(points[0][i], points[1][i], points[0][j], points[1][j]);

                if (distance > maxDistance) {
                    maxDistance = distance;
                    max1 = i;
                    max2 = j;
                }
            }
        }
        result[0][0] = points[0][max1];
        result[1][0] = points[1][max1];
        result[0][1] = points[0][max2];
        result[1][1] = points[1][max2];
        return result;
    }

    private static void printPoints(int[][] points) {
        int n = points[0].length;

        for (int i = 0; i < n; i++) {
            System.out.printf("(%3d;%3d) ", points[0][i], points[1][i]);
        }
        System.out.println();
    }
}